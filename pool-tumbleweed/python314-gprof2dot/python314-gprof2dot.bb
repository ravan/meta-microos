SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2025.4.14"

RPM_NAME = "python314-gprof2dot-2025.4.14-1.3.noarch.rpm"
RPM_HASH = "c100a3d3be19836f9f033e3cd13c096f7645f91e63187eb9a96bc011d939f98566b6710356306decde40cd80d75b181716fc11132aa33d2746b7c313b732b4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gprof2dot \
python314-gprof2dot \
python3dist-gprof2dot"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
