SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "libdialog15-1.3-14.1.aarch64.rpm"
RPM_HASH = "ea547163df1b6fd0779bf7bac45d085135929722261a6087e058e1d2a514b509cdcd0c6de337f165f44043b268f8cfced7eb261e57f0945a9151940a835bc20c"

RPROVIDES:${PN} += "libdialog.so.15 \
libdialog15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
