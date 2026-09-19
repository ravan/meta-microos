SUMMARY = "Documentation for OpenStack traits Library"
DESCRIPTION = "Traits are strings that represent a feature of some resource provider.  This \
library contains the catalog of constants that have been standardized in the \
OpenStack community to refer to a particular hardware, virtualization, storage, \
network, or device trait. \
 \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "python3-os-traits-doc-3.8.0-1.2.noarch.rpm"
RPM_HASH = "d67c2906bc05ffcbc3d9cc8fe1fae81a3d484e8f7f4067d5a6ec8405c2a915b491ce58610d444a34cbf01855711af80b87a3e6825566ea6adb1634b5d8fb856f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-traits-doc"

RDEPENDS:${PN} += ""

inherit rpm
