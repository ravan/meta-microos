SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "589edbb35f658e7916c0c97f3324893995e8cd0f56f99b4ee132fc43dc930cee4f0c77feea92a5824055648b7a5d4e5ef24545e2c6fbc18032babf677dee6883"

RPROVIDES:${PN} += "cmake-Qt6Quick3DIblBakerPrivate \
qt6-quick3diblbaker-private-devel"

RDEPENDS:${PN} += "cmake-Qt6GuiPrivate \
cmake-Qt6Quick3DIblBaker \
cmake-Qt6Quick3DRuntimeRenderPrivate"

inherit rpm
