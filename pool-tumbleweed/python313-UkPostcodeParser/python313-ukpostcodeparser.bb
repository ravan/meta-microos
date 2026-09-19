SUMMARY = "UK Postcode parser"
DESCRIPTION = "United Kingdom Postcode parser."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-UkPostcodeParser-1.1.2-6.5.noarch.rpm"
RPM_HASH = "2fcf8f58f62f9fd66e63244a9280b4acc697f06060084f1f44b5490f3b1df5c22742659651a8966894c945e4ff9232574f9d00abe486836f2b91b4557865f320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-UkPostcodeParser \
python3.13dist-ukpostcodeparser \
python313-UkPostcodeParser \
python3dist-ukpostcodeparser"

RDEPENDS:${PN} += "python-abi \
python313-base"

inherit rpm
