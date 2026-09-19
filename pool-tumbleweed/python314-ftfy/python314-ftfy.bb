SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.3.1"

RPM_NAME = "python314-ftfy-6.3.1-2.5.noarch.rpm"
RPM_HASH = "b3267afbac20cca7ce864f18654eebfabde3272fe105c594a77271013c47b3e68d3a44cff3508aa22438a075e2f724298a7edf20481258d94d3e50d387b7ddb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ftfy \
python314-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-wcwidth \
update-alternatives"

inherit rpm
