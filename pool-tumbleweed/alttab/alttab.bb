SUMMARY = "Task Switcher"
DESCRIPTION = "alttab is a X11 window switcher designed for minimalistic window managers or standalone X11 session."
LICENSE = "GPL-3.0-only"

PV = "1.8.0"

RPM_NAME = "alttab-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "06aa41d018ab0609baafda44beaadea73b59139916e4ae1669bbaea320fc4eae02050bd98cda4f167f9717df89e62cbb19fb7384df4ad95657e90a967b06983e"

RPROVIDES:${PN} += "alttab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
