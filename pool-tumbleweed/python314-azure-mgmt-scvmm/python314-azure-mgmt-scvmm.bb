SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-scvmm-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "5f8975fb144a0ae12512bc79254be640cf91cb1b041bc626d79cfc4eaee9bd49f4a79e6392ff46bf5c1b73c0b93d14c511d36b070d960d66e79e3142f24f30cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-scvmm \
python314-azure-mgmt-scvmm \
python3dist-azure-mgmt-scvmm"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
