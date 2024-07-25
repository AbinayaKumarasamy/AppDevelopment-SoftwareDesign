import {createSlice} from '@reduxjs/toolkit'
import cartItems from '../../cartItems';
const initialState = {
    cartItems:cartItems,
    amount: 4,
    total:4,
    isLoading:true,
}

const cartSlice = createSlice({
    name:'cart',
    initialState,
    reducers: {

        increase: (state,{payload})=>
        {
            const cartItem = state.cartItems.find((item) => item.id===payload.id);
            cartItem.amount = cartItem.amount+1;
        }
    }
})
export const{increase}=cartSlice.actions;
export default cartSlice.reducer