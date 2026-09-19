SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-uc-micro-py-2.0.0-1.3.noarch.rpm"
RPM_HASH = "20ace04d4d7f2b9dfba324a28857501d25e45985d33099db63dc4a2e3f58cac3f3ff4b64f1a17f0c2f650d310e511edc8a4699426ad0618563cd974a699b4077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uc-micro-py \
python314-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
