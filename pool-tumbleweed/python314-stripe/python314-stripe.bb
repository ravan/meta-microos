SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "15.5.1"

RPM_NAME = "python314-stripe-15.5.1-1.1.noarch.rpm"
RPM_HASH = "29d233381ea9de42117ab3db878db127251df1979b1c2b0b8d78b1813af33eb58ff164d9eccff812893fd9b2f56aa0408c0507584f4bd37cd0a78dd35b3a23ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stripe \
python314-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-typing-extensions"

inherit rpm
