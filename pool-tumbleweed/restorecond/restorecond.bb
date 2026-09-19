SUMMARY = "Daemon to restore SELinux contexts"
DESCRIPTION = "Daemon that watches for file creation and then sets the default SELinux file context"
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "restorecond-3.11-1.2.aarch64.rpm"
RPM_HASH = "2bf8c18ebab93865fffe8181f7b08cf094c4d4d6ecb9d05c58b8bfb00fcc2b8fbc49df36c411eed10875a8e17ee37254e4aadb54bae5814bf9c09ea515da535d"

RPROVIDES:${PN} += "config-restorecond \
restorecond"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1 \
libselinux1 \
selinux-tools"

inherit rpm
