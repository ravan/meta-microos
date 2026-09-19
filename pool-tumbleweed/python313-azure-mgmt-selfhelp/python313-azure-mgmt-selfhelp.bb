SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-selfhelp-1.0.0-2.9.noarch.rpm"
RPM_HASH = "a725bc1e5e348db4067f625219f6e77affe4cf2272c18cb54d4f71600f3a034fa8aac8769694bb1578215132fc9af7989752d98b7842aecdef06e7912ef92399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-selfhelp \
python3.13dist-azure-mgmt-selfhelp \
python313-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
