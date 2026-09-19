SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-gsm0338-1.1.0-1.4.noarch.rpm"
RPM_HASH = "03676bc51bc45509aa9ae8d1099f2155cb15f395c7e1ac61b5b3901aebc653f1cc437ae36b503a81bc01ad28cf3fc6acd91aa00c0edf62dccbf66b09e0b245ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gsm0338 \
python3.13dist-gsm0338 \
python313-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi"

inherit rpm
