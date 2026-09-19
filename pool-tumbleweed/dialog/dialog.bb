SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-1.3-14.1.aarch64.rpm"
RPM_HASH = "e4cef4face015bb477934d183b07410c89685cdbc949adf197b9d9c7a5926efbc5759caa549e823d5f695e32a8a2b72eb53ddb78d148e7553bb396afc8bca0a3"

RPROVIDES:${PN} += "config-dialog \
dialog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdialog.so.15 \
libncursesw.so.6 \
libtinfo.so.6 \
terminfo-base"

inherit rpm
