SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python314-parver-0.5-2.12.noarch.rpm"
RPM_HASH = "070e625ac7f4189db9954df7f88e52575b97e54bd8c6cbdd2fcfe950c2b421cde82a7573b76dd69111210cd71167a30dc40679754fd6defd9820ba638003d8f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parver \
python314-parver \
python3dist-parver"

RDEPENDS:${PN} += "python-abi \
python314-Arpeggio \
python314-attrs \
python314-typing-extensions"

inherit rpm
