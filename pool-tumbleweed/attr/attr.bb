SUMMARY = "Commands for Manipulating Extended Attributes"
DESCRIPTION = "A set of tools for manipulating extended attributes on file system \
objects, in particular getfattr(1) and setfattr(1). An attr(1) command \
is also provided, which is largely compatible with the SGI IRIX tool of \
the same name."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "attr-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "4298a66bc3e965aa6f4a143b016d056e97c30de610a190649216863c9c68d75114ee2a5518caacd2aabd106a81566d4a9264255461eba39706d565d3d624497f"

RPROVIDES:${PN} += "attr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libattr.so.1 \
libc.so.6"

inherit rpm
