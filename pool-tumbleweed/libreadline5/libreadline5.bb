SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "libreadline5-5.2-141.11.aarch64.rpm"
RPM_HASH = "86e3ceba9f88952f96f58c9a789b5fcbd0cf9e766644d1a39b39ed1b84a858f0afb59182c942542c32675abe559298315433ec8422516ae7ee5f8402e92ee13d"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.5 \
libhistory.so.5 \
libreadline.so.5 \
libreadline5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
