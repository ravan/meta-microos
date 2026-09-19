SUMMARY = "Tango Icon Theme"
DESCRIPTION = "This is the Tango base theme. On top of that, the package includes \
some specific icons from the legacy tango-icon-theme-extras package."
LICENSE = "CC-BY-SA-2.5"

PV = "0.8.90"

RPM_NAME = "tango-icon-theme-0.8.90-31.8.noarch.rpm"
RPM_HASH = "95452b4f6ee834d2fef78265092c72c62611e06660aed814b72cdef597a7d83297baf4de86e23532c0221c7849f31b65ca2d93d568f814ac91c57df27d500a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tango-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
