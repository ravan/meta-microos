SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "9.0.34"

RPM_NAME = "python313-phonenumbers-9.0.34-1.1.noarch.rpm"
RPM_HASH = "37075c7446be7be3f836aabd35cdc4b810df491b15a9b60e35adc5e7e68c5fb12d85cb725b95217756faf3deb0e70d322f6bdef1fa7239879a26bdd8f9138495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phonenumbers \
python3-phonenumberslite \
python3.13dist-phonenumbers \
python313-phonenumbers \
python313-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
