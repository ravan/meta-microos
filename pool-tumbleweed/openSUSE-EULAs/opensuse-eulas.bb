SUMMARY = "Collection of EULAs for openSUSE"
DESCRIPTION = "openSUSE-EULAs is a collection of the end user license agreements (EULAs) which \
govern use of certain (non-free) software. This software is typically packaged \
and maintained in the openSUSE NonFree repository."
LICENSE = "MIT"

PV = "84.87.20220520.1491bf6"

RPM_NAME = "openSUSE-EULAs-84.87.20220520.1491bf6-1.12.noarch.rpm"
RPM_HASH = "f2f13c599586317b87c47016ec2aeb2aef6ed808862ce6fa8055cc4c30150407a5bf1acb16e3af17ed83fc20471647c64a92e79ac98f959a9c72c9cb83f4c121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-EULAs \
package-EULAs"

RDEPENDS:${PN} += ""

inherit rpm
