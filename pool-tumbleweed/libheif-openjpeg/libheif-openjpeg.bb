SUMMARY = "Plugin OpenJPEG J2K encoder and decoder for JPEG-2000 in HEIF"
DESCRIPTION = "This plugin provides the OpenJPEG J2K encoder and decoder for JPEG to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-openjpeg-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "6a1973d36770c9f378023d3459b69154c89d31ac0014dbd19db854451bda78c65de0ceb9c81f85d73a1a1dabf5f08e1d7b7a24f0c76e0200705bb397eb7a18b0"

RPROVIDES:${PN} += "libheif-j2kdec.so \
libheif-j2kenc.so \
libheif-openjpeg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libopenjp2.so.7 \
libstdc++.so.6"

inherit rpm
