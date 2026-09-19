SUMMARY = "Microsoft Azure Artifactsigning Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Artifactsigning Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-artifactsigning-1.0.0-1.4.noarch.rpm"
RPM_HASH = "aa7d9afd850b52eb3c6ab8a8a2a69d2ce4b54a480660fb1f10f0ff432f43245e26fe528391851e4ff58a7ed2bc59031ab3e352917a3d494f0e3bb0505f029bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-artifactsigning \
python3.13dist-azure-mgmt-artifactsigning \
python313-azure-mgmt-artifactsigning \
python3dist-azure-mgmt-artifactsigning"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
