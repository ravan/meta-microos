SUMMARY = "Microsoft Azure Data Lake Management namespace package"
DESCRIPTION = "This is the Microsoft Azure Data Lake Management namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.mgmt.datalake namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-mgmt-datalake-nspkg-3.0.1-5.9.noarch.rpm"
RPM_HASH = "333096d04a2586e4a928d1bb007d71059b1e6685b6dcfd79cca814eaf1088c8ac655af956854e36ad3a43c47947c92327eeecaa822dd35dec9d532d92f8c6554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-nspkg \
python3.13dist-azure-mgmt-datalake-nspkg \
python313-azure-mgmt-datalake-nspkg \
python3dist-azure-mgmt-datalake-nspkg"

RDEPENDS:${PN} += "python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
