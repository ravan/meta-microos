SUMMARY = "Compositing manager for X servers"
DESCRIPTION = "xcompmgr is a sample compositing manager for X servers supporting the \
XFIXES, DAMAGE, RENDER, and COMPOSITE extensions. It enables basic \
eye-candy effects."
LICENSE = "MIT"

PV = "1.1.10"

RPM_NAME = "xcompmgr-1.1.10-1.9.aarch64.rpm"
RPM_HASH = "0550786d60496b1ba30001c5e80dffed5d1217c7bf6559597c8e91f280f21507a157d492ab51a08ab0cc36114c49390c53130cff07dafaaf92438d5dfca573a3"

RPROVIDES:${PN} += "xcompmgr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
