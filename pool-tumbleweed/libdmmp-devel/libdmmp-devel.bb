SUMMARY = "Header files for multipath-tools C API"
DESCRIPTION = "This package provides development files and documentation for libdmmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "libdmmp-devel-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "e996f481d1b109103d928ebf9f784944f89561461c20b4b6f7af51f3d3a0a94d57a164684f7f308d0322da1cd86734b4ff67cbb3b524a591003ab363ebfb3a80"

RPROVIDES:${PN} += "libdmmp-devel \
pkgconfig-libdmmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmmp0-2-0"

inherit rpm
