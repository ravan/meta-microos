SUMMARY = "2 and 3-way diff/merge tool"
DESCRIPTION = "TkDiff is a graphical 2 and 3-way diff/merge tool."
LICENSE = "GPL-2.0-or-later"

PV = "6.0"

RPM_NAME = "tkdiff-6.0-1.2.noarch.rpm"
RPM_HASH = "a60d735d022bf8868cb30d95c72174a1ba519529ec98309d3bd3ed50de1705dd4eb17ad8b1290dcef273e38a6f51d8b627e2f7bff6442c46ccb0d91c77cdee27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkdiff"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
tcl \
tk"

inherit rpm
