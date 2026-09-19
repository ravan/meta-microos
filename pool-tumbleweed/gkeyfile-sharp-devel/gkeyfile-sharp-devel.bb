SUMMARY = ".NET/C# Bindings for GKeyFile"
DESCRIPTION = "Files for developing programs that use gkeyfile-sharp"
LICENSE = "LGPL-2.1"

PV = "0.2"

RPM_NAME = "gkeyfile-sharp-devel-0.2-18.28.aarch64.rpm"
RPM_HASH = "766715b35c65e1bd6c30b8204f2a8df6f0acafb3aaf27cb4433f6d0edc4c915b928403f9c70274623ed2dff7d3bef01a2d9e5e6d3d201b00565f71a94f5c1c60"

RPROVIDES:${PN} += "gkeyfile-sharp-devel \
pkgconfig-gkeyfile-sharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gkeyfile-sharp \
pkgconfig-glib-sharp-2.0"

inherit rpm
