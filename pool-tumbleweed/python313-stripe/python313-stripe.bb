SUMMARY = "Python bindings for the Stripe API"
DESCRIPTION = "Python bindings for the Stripe API."
LICENSE = "MIT"

PV = "15.5.1"

RPM_NAME = "python313-stripe-15.5.1-1.1.noarch.rpm"
RPM_HASH = "3326dfdf026f6f3a22b722d19d9efb912434aa28376e001e8daf217f43e4d02a102a31848591049179216a74bda76b1bb2a7dbfec1c3e361e6e82d9f595f18e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stripe \
python3.13dist-stripe \
python313-stripe \
python3dist-stripe"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-typing-extensions"

inherit rpm
