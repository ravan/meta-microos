SUMMARY = "A Python interface to the R Programming Language"
DESCRIPTION = "RPy is a Python interface to the R Programming Language. It can \
manage all kinds of R objects and can execute arbitrary R functions \
(including the graphic functions). All errors from the R language are \
converted to Python exceptions. Any module installed for the R system \
can be used from Python. \
 \
This code is inspired by RSPython from the Omegahat project."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python314-rpy2-3.4.4-2.5.noarch.rpm"
RPM_HASH = "775ad0673e6934f1fcad7faa30e5ee924d8913d48291b7053aa1072d0e7b89cf1acb1e5786d704c1684570895652098bd0c5f329282538cae18a9dbd98dc5076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rpy2 \
python314-rpy2 \
python3dist-rpy2"

RDEPENDS:${PN} += "R-base \
python-abi \
python314-cffi \
python314-numpy \
readline"

inherit rpm
