SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-jsmin-3.0.1-2.5.noarch.rpm"
RPM_HASH = "029537e50f57bebc2e5d7b80f40c7fa35088cbe3904bf8dc60a45a41c8edc13a3a3097646458c98c03fa6f516204eb6ea1b8eca3dca5e386f022aa483bebd0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsmin \
python3.13dist-jsmin \
python313-jsmin \
python3dist-jsmin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
