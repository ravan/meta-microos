SUMMARY = "Microsoft Azure Terraform Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Terraform Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-terraform-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "f0b55a3b1295514ae4ffee6aeba281ff8dfb4a061652365d11596bd55c5097288f396a8b29c387c199cda95f989b8108c8f7864fbef5ee2eeaaacb209c68791c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-terraform \
python3.13dist-azure-mgmt-terraform \
python313-azure-mgmt-terraform \
python3dist-azure-mgmt-terraform"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
