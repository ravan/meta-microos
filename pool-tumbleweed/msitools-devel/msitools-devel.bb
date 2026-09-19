SUMMARY = "Development files for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "msitools is a set of programs to inspect and build Windows Installer \
(.MSI) files.  It is based on libmsi, a portable library to read and \
write .MSI files.  libmsi in turn is a port of (and a subset of) Wine's \
implementation of the Windows Installer. \
 \
msitools can be used for packaging and deployment of \
cross-compiled Windows applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.106"

RPM_NAME = "msitools-devel-0.106-1.7.aarch64.rpm"
RPM_HASH = "6304aef55ed4834571d661b1d7bc77b40b04c0c311aef2a34a74541a2e0f68c52deb8a28c6c8972ae1d93f98c50cf8e536f3a036cc1bc9b43d40485002b83bb9"

RPROVIDES:${PN} += "msitools-devel \
pkgconfig-libmsi-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsi-1-0-0 \
msitools \
pkgconfig-gio-2.0 \
typelib-1-0-Libmsi-1-0"

inherit rpm
