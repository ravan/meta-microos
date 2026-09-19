SUMMARY = "Library containing standardized trait strings."
DESCRIPTION = "Traits are strings that represent a feature of some resource provider.  This \
library contains the catalog of constants that have been standardized in the \
OpenStack community to refer to a particular hardware, virtualization, storage, \
network, or device trait."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "python313-os-traits-3.8.0-1.2.noarch.rpm"
RPM_HASH = "c506430b1e2c771f34b212d9099bece1951e21afdfc6104d349fdc334766998bf4b29721d06dc70c5693d17b92fa7b40455cb337aec9d1b6344e0da233960299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-traits \
python3.13dist-os-traits \
python313-os-traits \
python3dist-os-traits"

RDEPENDS:${PN} += "python-abi \
python313-pbr \
python313-six"

inherit rpm
