SUMMARY = "A Fast, spec compliant Python 3.12+ tokenizer that runs on older Pythons"
DESCRIPTION = "A Fast, spec compliant Python 3.12+ tokenizer that runs on older Pythons."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-pytokens-0.4.1-1.5.aarch64.rpm"
RPM_HASH = "3d69696614db23d26cf72e87d9539eb88474f0a3740e9fbfe615521358189b5d3ca52015fd487811a93e65f8cc0a87058a69a465e01a7648fde81b152ceab38b"

RPROVIDES:${PN} += "python3.14dist-pytokens \
python314-pytokens \
python3dist-pytokens"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
