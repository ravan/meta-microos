SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.29.0"

RPM_NAME = "python314-ase-3.29.0-1.1.noarch.rpm"
RPM_HASH = "d705f4f61c15601f81b1fbd322adc02c1a37a8367a037dd1dff05b6caa1f297df95b6d2c028fecb265544a97ed37d3124742f588c8898bf4951916dca91dd80b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ase \
python314-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-matplotlib \
python314-numpy \
python314-scipy \
python314-typing-extensions"

inherit rpm
