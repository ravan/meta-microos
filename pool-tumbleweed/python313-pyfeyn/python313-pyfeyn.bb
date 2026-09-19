SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python313-pyfeyn-1.0.0-6.5.noarch.rpm"
RPM_HASH = "2b262a14bcf5f30155135a85f5e4729306af65683b1cdcd4b656cea959a28fe530b388b0e925915eb7bf31117788a9d1c3dfcd138a2109a09097146d4491d700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfeyn \
python3.13dist-pyfeyn \
python313-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyX \
update-alternatives"

inherit rpm
