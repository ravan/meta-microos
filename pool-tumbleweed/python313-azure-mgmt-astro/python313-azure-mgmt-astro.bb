SUMMARY = "Microsoft Azure Astro Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Astro Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-astro-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "aa4fc525dffdee7c50554dd7e65bb300bdfcaad913f682e967d61f6da0a74e579465089c940b416e6842374da034ffea5e2b39d2f47235cc58fc54b7039187c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-astro \
python3.13dist-azure-mgmt-astro \
python313-azure-mgmt-astro \
python3dist-azure-mgmt-astro"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
