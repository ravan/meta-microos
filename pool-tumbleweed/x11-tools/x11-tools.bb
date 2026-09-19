SUMMARY = "Tools for the X Window System"
DESCRIPTION = "Some useful tools for the X Window System."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.1"

RPM_NAME = "x11-tools-0.1-213.10.noarch.rpm"
RPM_HASH = "efceb5156323b909b640e2ea12c45982436d097a64d0abe132e4ac5c5ee8b065dfede27fe3297744c97cf7b2c08a7d008994f7ec81ab408aeefb62b237e5b7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "3ddiag \
x11-tools \
xf86tools"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
