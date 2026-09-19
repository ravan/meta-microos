SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python314-pyshark-0.6-3.2.noarch.rpm"
RPM_HASH = "ccbd857bc4aa34f6bd2922c691a632d33beba7f003c377ad35b42109525c29d6ab5d2b59c4641378a1b8e5db19b9caef61121c8d6c0b2afc48572d7062b8b74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyshark \
python314-pyshark \
python3dist-pyshark"

RDEPENDS:${PN} += "python-abi \
python314-appdirs \
python314-lxml \
python314-packaging \
python314-termcolor \
wireshark"

inherit rpm
