SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-gsm0338-1.1.0-1.4.noarch.rpm"
RPM_HASH = "007b3f73053aae21a4630b536b9e9a1c8e19d562e29d54aaa602c50165258d4abfbb8c869528074d5cca6c43a6b90b121a4f074ad85eae6c89386e72f40ecedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gsm0338 \
python314-gsm0338 \
python3dist-gsm0338"

RDEPENDS:${PN} += "python-abi"

inherit rpm
