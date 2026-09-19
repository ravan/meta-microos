SUMMARY = "Development files for libomemo-c"
DESCRIPTION = "Development files and headers for libomemo-c"
LICENSE = "GPL-3.0-only"

PV = "0.5.1"

RPM_NAME = "libomemo-c-devel-0.5.1-2.5.aarch64.rpm"
RPM_HASH = "aa27fbb480564433921d561ad2201c6b82bffdf8f415cb4bea530062420120a63bbd156997f5212d7268c3b5cb5160bef633028effd0651b09dcff64acce7666"

RPROVIDES:${PN} += "libomemo-c-devel \
pkgconfig-libomemo-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomemo-c0 \
protobuf-c-devel"

inherit rpm
