SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "lsp-plugins-common-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "f23095eda575a273b8bf38d82a0e2e59e614126956c1744a2da1afd8ade218643f1fc27dcd781354082dfd5361d1a237f6ef30c938da018179217c0b172741cb"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.30.so \
lsp-plugins-common"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
