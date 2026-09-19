SUMMARY = ".NET/C# Bindings for GUDev"
DESCRIPTION = "Files for developing programs that use gudev-sharp"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gudev-sharp-devel-0.2-21.18.aarch64.rpm"
RPM_HASH = "7526cb14806a4ca1e75472b5ea59d472a63d82e8a7966e59c0cf9923f050d249db5be84ff3dd302b6296c276eeb6a5e3441454b38a7d27dad5ec8e36f51c674a"

RPROVIDES:${PN} += "gudev-sharp-devel \
pkgconfig-gudev-sharp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gudev-sharp \
pkgconfig-glib-sharp-2.0"

inherit rpm
