SUMMARY = "Complex Textlayout Library"
DESCRIPTION = "Library that encapsulates the logic for complex \
text layout and provides a convenient API."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "libraqm-devel-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "20e34e539706caca8f363c534f339a81c53accb49dd1dc58405265346191197e660163387989122dcc1e32c731bcd4188955e13cbb49477bc812b096f434a43d"

RPROVIDES:${PN} += "libraqm-devel \
pkgconfig-raqm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraqm0 \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-harfbuzz"

inherit rpm
