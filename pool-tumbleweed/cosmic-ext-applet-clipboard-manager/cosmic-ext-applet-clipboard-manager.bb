SUMMARY = "Clipboard manager for COSMIC"
DESCRIPTION = "The goal is to make a simple yet fast clipboard history, with a focus on UX, \
rapidity and security. \
 \
Currently support storing the history on disk, search, delete"
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20241008.f349d15"

RPM_NAME = "cosmic-ext-applet-clipboard-manager-0.1.0+git20241008.f349d15-1.13.aarch64.rpm"
RPM_HASH = "c08315300f38bf222da07bd967c9849220f9a739c97202b5e36971b48dd5c6b0989fa1cf9761888334c7e265f71dc3906a4ed7bae07ee41a52ace16131b68317"

RPROVIDES:${PN} += "cosmic-ext-applet-clipboard-manager"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
