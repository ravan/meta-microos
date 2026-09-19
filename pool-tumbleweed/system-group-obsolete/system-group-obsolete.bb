SUMMARY = "Obsolete system groups"
DESCRIPTION = "This package provides some obsolete system groups."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-group-obsolete-20250822-2.3.noarch.rpm"
RPM_HASH = "524917efaf89cc36b95879aa9acb1f2d5dd90e3d26eb34ff3353861dcb31f82122d8c0f8f89cfb7eb91e384f6e4e0bfc28fa225d636f5a4a0920f063a2ae95b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-console \
group-floppy \
group-modem \
group-public \
group-sys \
group-xok \
system-group-obsolete"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
