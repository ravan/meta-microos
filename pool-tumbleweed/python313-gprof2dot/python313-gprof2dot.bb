SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2025.4.14"

RPM_NAME = "python313-gprof2dot-2025.4.14-1.3.noarch.rpm"
RPM_HASH = "c1737c2beebb3d363c1beee96eb1c5a4803029a9e5cfdff18a95543ea23d94806b6197ee8e22c5aaac16933878aec78d3d54badd79c88a166a6a709ce5888595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gprof2dot \
python3.13dist-gprof2dot \
python313-gprof2dot \
python3dist-gprof2dot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
