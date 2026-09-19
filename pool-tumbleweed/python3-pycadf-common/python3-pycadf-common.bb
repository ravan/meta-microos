SUMMARY = "Common files for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Configuration files for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python3-pycadf-common-4.1.0-1.1.noarch.rpm"
RPM_HASH = "ed6a55e31dd92940ab9aa4da7379c71ad73d3555cee40d1d13741eeb601f1772cfeb5632a3e15d9710dba3b472faf5561a71c987fe5bd26c67a5ec2368450fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-pycadf-common \
python-pycadf-common \
python3-pycadf-common"

RDEPENDS:${PN} += ""

inherit rpm
