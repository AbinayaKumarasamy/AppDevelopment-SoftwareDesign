import React from 'react';
import './TermLifeInsurance.css';
import { FaCheck, FaInfoCircle, FaPhoneAlt } from 'react-icons/fa';

const TermLifeInsurance = () => {
  return (
    <div className="container">
      <header className="header">
        <h1 className="title">Term Life Insurance</h1>
        <p className="subtitle">Affordable and flexible life insurance plans to protect your loved ones financially.</p>
      </header>

      <main className="main">
        <section className="section">
          <h2 className="section-title">Overview</h2>
          <p className="section-content">
            Term life insurance provides coverage at a fixed rate of payments for a limited period of time. After that period, coverage at the previous rate of premiums is no longer guaranteed, and the client must either forego coverage or potentially obtain further coverage with different payments or conditions.
          </p>
        </section>

        <section className="section">
          <h2 className="section-title">Coverage Details</h2>
          <ul className="list">
            <li><FaCheck className="icon" /> Coverage Amount: $50,000 to $1,000,000</li>
            <li><FaCheck className="icon" /> Policy Term: 10, 20, or 30 years</li>
            <li><FaCheck className="icon" /> Premiums: Fixed for the term of the policy</li>
            <li><FaCheck className="icon" /> Renewable and Convertible Options</li>
          </ul>
        </section>

        <section className="section">
          <h2 className="section-title">Benefits</h2>
          <ul className="list">
            <li><FaCheck className="icon" /> Financial security for your loved ones</li>
            <li><FaCheck className="icon" /> Affordable premiums</li>
            <li><FaCheck className="icon" /> Flexibility to choose the term</li>
            <li><FaCheck className="icon" /> Peace of mind</li>
          </ul>
        </section>

        <section className="section">
          <h2 className="section-title">Eligibility Criteria</h2>
          <ul className="list">
            <li><FaCheck className="icon" /> Age: 18-65 years</li>
            <li><FaCheck className="icon" /> Health: Must undergo a medical examination</li>
            <li><FaCheck className="icon" /> Non-smoker status preferred</li>
          </ul>
        </section>

        <section className="section">
          <h2 className="section-title">FAQs</h2>
          <div className="faq">
            <div className="faq-item">
              <h3 className="faq-question">What is term life insurance?</h3>
              <p className="faq-answer">Term life insurance is a type of life insurance that provides coverage for a specific period of time or "term". If the insured person passes away during the term, the beneficiary receives a death benefit.</p>
            </div>
            <div className="faq-item">
              <h3 className="faq-question">How does term life insurance work?</h3>
              <p className="faq-answer">You pay regular premiums for the duration of the term. If you pass away during the term, the insurance company pays a death benefit to your beneficiaries. If you outlive the term, the policy expires without any payout.</p>
            </div>
            <div className="faq-item">
              <h3 className="faq-question">Can I renew my term life insurance policy?</h3>
              <p className="faq-answer">Yes, many term life insurance policies offer the option to renew the policy at the end of the term. However, the premiums may increase based on your age and health at the time of renewal.</p>
            </div>
          </div>
        </section>

        <section className="section">
          <h2 className="section-title">Contact Us</h2>
          <form className="contact-form">
            <div className="form-group">
              <label className="form-label" htmlFor="name">Name</label>
              <input type="text" id="name" className="form-input" />
            </div>
            <div className="form-group">
              <label className="form-label" htmlFor="email">Email</label>
              <input type="email" id="email" className="form-input" />
            </div>
            <div className="form-group">
              <label className="form-label" htmlFor="message">Message</label>
              <textarea id="message" className="form-textarea"></textarea>
            </div>
            <button type="submit" className="form-button">Submit</button>
          </form>
        </section>
      </main>

      <footer className="footer">
        <p>Need help? <FaPhoneAlt className="icon" /> Call us at 1-800-123-4567</p>
      </footer>
    </div>
  );
};

export default TermLifeInsurance;
