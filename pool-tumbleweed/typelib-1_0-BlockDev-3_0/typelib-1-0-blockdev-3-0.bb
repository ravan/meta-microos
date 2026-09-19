SUMMARY = "GI bindings for the LibBlockDev library"
DESCRIPTION = "This package provides the GObject Introspection bindings for LibBlockDev, which \
provides low-level manipulation of block devices."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "typelib-1_0-BlockDev-3_0-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "7c92c1635940eb2330cab0ea60e595e11d9789ff6fb460397783029eed21215814193dedb4ac62a2f89e0704e7f2f4b80f16bd986d5e5436c949ce16b6bcc1fc"

RPROVIDES:${PN} += "typelib-1-0-BlockDev-3-0 \
typelib-BlockDev"

RDEPENDS:${PN} += "libbd-utils.so.3 \
libblockdev.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
