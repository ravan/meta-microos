SUMMARY = "Toolchain for Stitching of Images and Creating Panoramas"
DESCRIPTION = "Hugin can be used to stitch multiple images together. The resulting \
image can span 360 degrees. Another common use is the creation of very \
high resolution pictures by combining multiple images. \
 \
Other tools in this package can correct lens distortion, vignetting and \
chromatic abberation, create HDR images, provide automatic feature \
detection and extraction of key points."
LICENSE = "GPL-2.0-or-later"

PV = "2025.0.1"

RPM_NAME = "hugin-2025.0.1-1.4.aarch64.rpm"
RPM_HASH = "43595b9911cbbcc428d5c06e5fe47a578550996434a98a2e6d8ba0b8975477a4bf79e44149f4ca7b6d8225b662945dd9c970ee765667f1a6ffd17ea6013488b1"

RPROVIDES:${PN} += "hugin \
libceleste.so.0.0 \
libhuginbase.so.0.0 \
libhuginbasewx.so.0.0 \
libicpfindlib.so.0.0 \
liblocalfeatures.so.0.0"

RDEPENDS:${PN} += "enblend-enfuse \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libOpenGL.so.0 \
libX11.so.6 \
libblas.so.3 \
libc.so.6 \
libepoxy.so.0 \
libexiv2.so.28 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
liblcms2.so.2 \
liblz4.so.1 \
libm.so.6 \
libpano13.so.3 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libvigraimpex.so.11 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-propgrid-suse.so.16.0.0 \
libwx-gtk3u-qa-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse.so.16.0.0 \
make"

inherit rpm
