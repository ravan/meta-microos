SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python314-pyfeyn-1.0.0-6.5.noarch.rpm"
RPM_HASH = "7af13287eb9fef7b464970ba77f1d269b09c22f904f2f572c380a5e7b1f60fa7c6e3efa3a3d4d50c9baa1566f4b957910d5b63dfa8537f7cde05830019442fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyfeyn \
python314-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyX \
update-alternatives"

inherit rpm
