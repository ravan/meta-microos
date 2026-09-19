SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.21.2"

RPM_NAME = "python314-pyupgrade-3.21.2-1.4.noarch.rpm"
RPM_HASH = "ecd2a9a7775b6e4f46b689c2c18261cac29ffe5dc6fb85ee58e6b325235023886ff46739978ecedcf5bebf12caa001f22330628c527588401b480f4bea67be37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyupgrade \
python314-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-tokenize-rt \
update-alternatives"

inherit rpm
