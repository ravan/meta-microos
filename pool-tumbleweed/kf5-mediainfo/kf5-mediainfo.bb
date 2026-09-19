SUMMARY = "KF5 extension for mediainfo-gui"
DESCRIPTION = "KF5 context menu extension for mediainfo-gui."
LICENSE = "GPL-2.0-or-later"

PV = "26.05"

RPM_NAME = "kf5-mediainfo-26.05-1.2.aarch64.rpm"
RPM_HASH = "146c3e4271f0ecc8ffdddfcf89efe5738b7d4a8ccaeadb50d83a7c29a292ac7ab2949ef486cfa32525d5c12a00b1c071eb861a40b0f72cc0e2bb4acc2908b36e"

RPROVIDES:${PN} += "kde4-mediainfo \
kf5-mediainfo"

RDEPENDS:${PN} += "mediainfo-gui"

inherit rpm
