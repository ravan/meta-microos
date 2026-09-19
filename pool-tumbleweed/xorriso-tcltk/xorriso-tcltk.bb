SUMMARY = "Graphical frontend for xorriso"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
 \
This package provides a graphical frontend to xorriso."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "xorriso-tcltk-1.5.8-1.2.aarch64.rpm"
RPM_HASH = "03fa6732b2432dc66a27108c589185d580b25a8d3f9830e2715d71a845f4ada60f2d7ce0c40d9529166577a6a112f01d8c8774f4d7bfaeccd09761862cae5038"

RPROVIDES:${PN} += "xorriso-tcltk"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/wish \
tcl \
tk \
xorriso"

inherit rpm
