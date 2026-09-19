SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "The libXcm library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
servers. A EDID parser and a color management event observer are included. \
The package contains headers and other development files."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcm-devel-0.5.4-1.32.aarch64.rpm"
RPM_HASH = "b9bd0c7f3e94e56baac487b9d70578f8e217282eaa5727f9da12df4ad1e2bee70ebe81d082bddee82c6a5cdf1105dd07d07132cb7c6a1c00c04926c93c000f95"

RPROVIDES:${PN} += "libXcm-devel \
pkgconfig-xcm \
pkgconfig-xcm-ddc \
pkgconfig-xcm-edid \
pkgconfig-xcm-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcm0 \
libXcmDDC0 \
libXcmEDID0 \
libXcmX11-0 \
pkgconfig-x11 \
pkgconfig-xcm-ddc \
pkgconfig-xcm-edid \
pkgconfig-xcm-x11 \
pkgconfig-xproto"

inherit rpm
