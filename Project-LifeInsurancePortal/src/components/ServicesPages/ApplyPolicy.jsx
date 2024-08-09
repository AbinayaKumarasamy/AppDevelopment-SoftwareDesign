import React, { useState } from 'react';
import axios from 'axios';

const ApplyPolicy = ({ closeForm }) => {
  const [formValues, setFormValues] = useState({
    name: '',
    email: '',
    phoneNumber: '',
    age: '',
    healthConditions: '',
    gender: '',
    maritalStatus: '',
    nationality: '',
    occupation: '',
    employer: '',
    annualIncome: '',
    address: '',
    ssn: '',
    driverLicenseNumber: '',
    passportNumber: '',
    insuranceType: '',
    policyTerm: '',
    coverageAmount: '',
    beneficiaries: '',
    height: '',
    weight: '',
    smokingStatus: false,
    alcoholConsumption: '',
    medicalHistory: '',
    currentMedications: '',
    primaryCarePhysician: '',
    existingPolicies: '',
    outstandingDebts: '',
    paymentMethod: '',
    bankAccountDetails: '',
    billingAddress: '',
    agentBrokerInfo: '',
    referralInfo: ''
  });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setFormValues({
      ...formValues,
      [name]: type === 'checkbox' ? checked : value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    const token = localStorage.getItem('token');
    
    if (!token) {
      alert("Authentication token not found!");
      return;
    }

    console.log("Form Values:", formValues);
    console.log("Using token:", token);

    if (!formValues.name || !formValues.email) {
      alert("Name and email are required fields!");
      return;
    }

    try {
      const response = await axios.post(
        "http://localhost:8081/api/policies",
        formValues,
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      console.log("Response Data:", response.data);
      alert("Registration Successful!");
    } catch (error) {
      console.error("Error during submission:", error.response || error.message);
      alert("Registration Failed!");
    }
  };

  return (
    <div className="modal">
      <div className="modal-content">
        <h2>Apply for Term Life Insurance</h2>
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label className="form-label" htmlFor="name">Name</label>
            <input
              type="text"
              id="name"
              name="name"
              value={formValues.name}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="email">Email</label>
            <input
              type="email"
              id="email"
              name="email"
              value={formValues.email}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="phoneNumber">Phone Number</label>
            <input
              type="tel"
              id="phoneNumber"
              name="phoneNumber"
              value={formValues.phoneNumber}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="age">Age</label>
            <input
              type="number"
              id="age"
              name="age"
              value={formValues.age}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="healthConditions">Health Conditions</label>
            <textarea
              id="healthConditions"
              name="healthConditions"
              value={formValues.healthConditions}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="gender">Gender</label>
            <input
              type="text"
              id="gender"
              name="gender"
              value={formValues.gender}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="maritalStatus">Marital Status</label>
            <input
              type="text"
              id="maritalStatus"
              name="maritalStatus"
              value={formValues.maritalStatus}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="nationality">Nationality</label>
            <input
              type="text"
              id="nationality"
              name="nationality"
              value={formValues.nationality}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="occupation">Occupation</label>
            <input
              type="text"
              id="occupation"
              name="occupation"
              value={formValues.occupation}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="employer">Employer</label>
            <input
              type="text"
              id="employer"
              name="employer"
              value={formValues.employer}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="annualIncome">Annual Income</label>
            <input
              type="number"
              id="annualIncome"
              name="annualIncome"
              value={formValues.annualIncome}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="address">Address</label>
            <input
              type="text"
              id="address"
              name="address"
              value={formValues.address}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="ssn">Social Security Number</label>
            <input
              type="text"
              id="ssn"
              name="ssn"
              value={formValues.ssn}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="driverLicenseNumber">Driver License Number</label>
            <input
              type="text"
              id="driverLicenseNumber"
              name="driverLicenseNumber"
              value={formValues.driverLicenseNumber}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="passportNumber">Passport Number</label>
            <input
              type="text"
              id="passportNumber"
              name="passportNumber"
              value={formValues.passportNumber}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="insuranceType">Insurance Type</label>
            <input
              type="text"
              id="insuranceType"
              name="insuranceType"
              value={formValues.insuranceType}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="policyTerm">Policy Term (Years)</label>
            <input
              type="number"
              id="policyTerm"
              name="policyTerm"
              value={formValues.policyTerm}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="coverageAmount">Coverage Amount</label>
            <input
              type="number"
              id="coverageAmount"
              name="coverageAmount"
              value={formValues.coverageAmount}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="beneficiaries">Beneficiaries</label>
            <textarea
              id="beneficiaries"
              name="beneficiaries"
              value={formValues.beneficiaries}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="height">Height (cm)</label>
            <input
              type="number"
              id="height"
              name="height"
              value={formValues.height}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="weight">Weight (kg)</label>
            <input
              type="number"
              id="weight"
              name="weight"
              value={formValues.weight}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="smokingStatus">Smoking Status</label>
            <input
              type="checkbox"
              id="smokingStatus"
              name="smokingStatus"
              checked={formValues.smokingStatus}
              onChange={handleChange}
              className="form-checkbox"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="alcoholConsumption">Alcohol Consumption</label>
            <input
              type="text"
              id="alcoholConsumption"
              name="alcoholConsumption"
              value={formValues.alcoholConsumption}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="medicalHistory">Medical History</label>
            <textarea
              id="medicalHistory"
              name="medicalHistory"
              value={formValues.medicalHistory}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="currentMedications">Current Medications</label>
            <textarea
              id="currentMedications"
              name="currentMedications"
              value={formValues.currentMedications}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="primaryCarePhysician">Primary Care Physician</label>
            <input
              type="text"
              id="primaryCarePhysician"
              name="primaryCarePhysician"
              value={formValues.primaryCarePhysician}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="existingPolicies">Existing Policies</label>
            <textarea
              id="existingPolicies"
              name="existingPolicies"
              value={formValues.existingPolicies}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="outstandingDebts">Outstanding Debts</label>
            <textarea
              id="outstandingDebts"
              name="outstandingDebts"
              value={formValues.outstandingDebts}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="paymentMethod">Payment Method</label>
            <input
              type="text"
              id="paymentMethod"
              name="paymentMethod"
              value={formValues.paymentMethod}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="bankAccountDetails">Bank Account Details</label>
            <textarea
              id="bankAccountDetails"
              name="bankAccountDetails"
              value={formValues.bankAccountDetails}
              onChange={handleChange}
              className="form-textarea"
            ></textarea>
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="billingAddress">Billing Address</label>
            <input
              type="text"
              id="billingAddress"
              name="billingAddress"
              value={formValues.billingAddress}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="agentBrokerInfo">Agent/Broker Info</label>
            <input
              type="text"
              id="agentBrokerInfo"
              name="agentBrokerInfo"
              value={formValues.agentBrokerInfo}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <div className="form-group">
            <label className="form-label" htmlFor="referralInfo">Referral Info</label>
            <input
              type="text"
              id="referralInfo"
              name="referralInfo"
              value={formValues.referralInfo}
              onChange={handleChange}
              className="form-input"
            />
          </div>

          <button type="submit" className="form-button"onClick={handleSubmit}>Submit</button>
          <button type="button" onClick={closeForm} className="form-button cancel-button">Cancel</button>
        </form>
      </div>
    </div>
  );
};

export default ApplyPolicy;
