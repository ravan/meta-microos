SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "libreadline6-6.3-6.5.aarch64.rpm"
RPM_HASH = "57940ca173b8b38b2a5d547ee95f4049b0b971d0dabf3030ac026021cfb9273e68e251ccba7fa32da57862e4cc519c26ae0e233f52c34fe748c52acabd975e59"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.6 \
libhistory.so.6 \
libreadline.so.6 \
libreadline6 \
readline"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
