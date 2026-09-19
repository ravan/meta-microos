SUMMARY = "Tools to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files. \
 \
msitools plans to be a solution for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.106"

RPM_NAME = "msitools-0.106-1.7.aarch64.rpm"
RPM_HASH = "68ec1c7fd70504216c21ba06a327a2599622136b149af9562293731da46689d5f2905da02b33e34398c8c7c2fbcfd578212f22556be55e22ef5a1e287f1638eb"

RPROVIDES:${PN} += "msitools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmsi-1.0.so.0 \
libxml2.so.16"

inherit rpm
