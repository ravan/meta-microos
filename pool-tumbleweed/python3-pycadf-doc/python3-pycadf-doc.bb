SUMMARY = "Documentation for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Documentation for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python3-pycadf-doc-4.1.0-1.1.noarch.rpm"
RPM_HASH = "79391426f6403362e63fcbd040b5bb52eee71ab24ded302289f39e3521f75be09499ce77357a1d53d502a9fe94d4f7762bdac2dc9c674a47a1e7725569199ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycadf-doc \
python3-pycadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
