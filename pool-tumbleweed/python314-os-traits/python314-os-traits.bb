SUMMARY = "Library containing standardized trait strings."
DESCRIPTION = "Traits are strings that represent a feature of some resource provider.  This \
library contains the catalog of constants that have been standardized in the \
OpenStack community to refer to a particular hardware, virtualization, storage, \
network, or device trait."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "python314-os-traits-3.8.0-1.2.noarch.rpm"
RPM_HASH = "901edbd5e6b2a8d1f4eef67b75f07a4867d54ccc01326e5a44c6715b6c50f3c2dd24ce8c0d51b3b85fa992dedae581cf53faa5b4cdd8a67281e10e4e616f488f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-os-traits \
python314-os-traits \
python3dist-os-traits"

RDEPENDS:${PN} += "python-abi \
python314-pbr \
python314-six"

inherit rpm
