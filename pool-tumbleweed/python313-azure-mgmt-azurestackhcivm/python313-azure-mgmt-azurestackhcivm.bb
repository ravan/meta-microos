SUMMARY = "Microsoft Azure Azurestackhcivm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurestackhcivm Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-azurestackhcivm-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "f0409ef039cf2d12bc517472313de69ab118da312977dc4207b1bfe792667b2e39af82b761799371c0e5b7ed671fb37cb0dd28e067db4530de63f2cf15559947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurestackhcivm \
python3.13dist-azure-mgmt-azurestackhcivm \
python313-azure-mgmt-azurestackhcivm \
python3dist-azure-mgmt-azurestackhcivm"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
