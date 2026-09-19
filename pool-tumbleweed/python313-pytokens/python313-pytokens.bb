SUMMARY = "A Fast, spec compliant Python 3.12+ tokenizer that runs on older Pythons"
DESCRIPTION = "A Fast, spec compliant Python 3.12+ tokenizer that runs on older Pythons."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python313-pytokens-0.4.1-1.5.aarch64.rpm"
RPM_HASH = "1c4a08cb069c69f19cd28279108d7b4e87d588c2167a0ceb8e98cbeeaef8399983973984526f98d1cdae5775310b1a76a02f830035cdefde148f3fa9d0da1ed6"

RPROVIDES:${PN} += "python3-pytokens \
python3.13dist-pytokens \
python313-pytokens \
python3dist-pytokens"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
