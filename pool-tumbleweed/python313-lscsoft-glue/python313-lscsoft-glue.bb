SUMMARY = "Grid LSC User Environment"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database."
LICENSE = "GPL-2.0-only"

PV = "4.1.1"

RPM_NAME = "python313-lscsoft-glue-4.1.1-1.3.noarch.rpm"
RPM_HASH = "544232dc50f59ba914a38547d1fcc2b2a94fbf50b4f9607e2e6f31d5933e8aab9874d2b5685634411c087fe78afa68026321bbdcf1e4533d577da601541006a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lscsoft-glue-data \
python-glue \
python3-glue \
python3-lscsoft-glue \
python3.13dist-lscsoft-glue \
python313-glue \
python313-lscsoft-glue \
python3dist-lscsoft-glue"

RDEPENDS:${PN} += "python-abi \
python313-igwn-segments \
update-alternatives"

inherit rpm
