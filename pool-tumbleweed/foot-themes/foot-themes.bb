SUMMARY = "Community-contributed themes for the foot terminal emulator"
DESCRIPTION = "This package contains popular themes for the foot terminal emulator providing \
users an easy way to theme foot."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "foot-themes-1.28.0-1.1.noarch.rpm"
RPM_HASH = "e35125c7b67a8d5315591cb5e66bc5fb21cdd729bc783a7efc43b14d24f5afb5bd3d2c7acd479ccb41332d8e548ba3fac54f48005bb4c5c2387e64d28e4d87ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-themes"

RDEPENDS:${PN} += "foot"

inherit rpm
