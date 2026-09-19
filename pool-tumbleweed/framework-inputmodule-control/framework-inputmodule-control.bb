SUMMARY = "Framework Laptop 16 Input Module software"
DESCRIPTION = "Framework Laptop 16 Input Module software"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "framework-inputmodule-control-0.2.0-3.8.aarch64.rpm"
RPM_HASH = "bd096f9260db63885afe701518dd8954b75a75aff0a44ec23f6f46d817883617cb5ca3eeb3f2e13def792c692ff0cf61179d4208434911b6c6d26efd7ec69e0c"

RPROVIDES:${PN} += "framework-inputmodule-control"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libudev.so.1"

inherit rpm
