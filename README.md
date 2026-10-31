# Kavach — UPI Scam Shield

A polished, privacy-first frontend demo for a multimodal Indian financial-scam detector. It accepts pasted messages and UPI/QR payloads, plus local file selection for screenshot and voice-note demo flows. The assessment uses explainable, client-side heuristics; it does **not** upload content, access payments, or claim bank-grade fraud detection.

## Run it

Open `index.html` in a modern browser. No dependency installation or server is required.

## Android APK

`Kavach-Scam-Shield-v1.0.0-debug.apk` is the installable Android demo build. It supports Android 6.0 and newer. This is a debug-signed demo APK, intended for presentations and testing—not Google Play distribution. A Play release must be signed with the owner’s private release key.

## Demo script (90 seconds)

1. Open the app and say: “Kavach is a second opinion before a UPI approval.”
2. Select **Message**, choose **Try a sample**, then **Analyse safely**.
3. Highlight the High Risk verdict, urgency signals, collect-request warning, and the 1930 guidance.
4. Select **QR / UPI** and paste `upi://pay?pa=merchant@upi&pn=Reward&tn=collect`; analyse it to show payment-flow inspection.
5. Toggle to Hindi using the top-right control.
6. Finish by explaining that actual production integrations would require verified bank/PSP data, audited ML models, consent controls, and an incident-response programme.

## Security notes

- Inputs remain in the browser; the project makes no network calls except the explicit cybercrime.gov.in report link.
- User-controlled filenames and detected words are escaped before being inserted into the page.
- External reporting opens in a new tab with `noopener,noreferrer`.
- Do not position this demo as a real fraud guarantee. False positives and false negatives are possible.

## GitHub upload

Create a new empty GitHub repository, then commit these files from this folder. Enable GitHub Pages from the `main` branch to share a live demo.
