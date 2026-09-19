SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "4.1.1"

RPM_NAME = "python314-lscsoft-glue-4.1.1-1.3.noarch.rpm"
RPM_HASH = "638ce2a4d6f4578432e2154aeb5b5a4744a739233d5d015f306fede42213f2c42dc4556dabfd2e28d1ac0c576e2dce4220aadb05b19f34392ab8d3f0bb802b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lscsoft-glue-data \
python-glue \
python3.14dist-lscsoft-glue \
python314-glue \
python314-lscsoft-glue \
python3dist-lscsoft-glue"

RDEPENDS:${PN} += "python-abi \
python314-igwn-segments \
update-alternatives"

inherit rpm
