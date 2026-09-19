SUMMARY = "Wayland on-screen keyboard"
DESCRIPTION = "Wayland on-screen keyboard."
LICENSE = "GPL-3.0-only"

PV = "0.20"

RPM_NAME = "wvkbd-0.20-1.1.aarch64.rpm"
RPM_HASH = "e31f4203181f533d9eea03bb8a7808eafeb4cf2655d79805a12fd05c293ef959ae24d5e57c21523f1b2fc21eb18caae0654b5aa0092c05efe8970619de13d1ef"

RPROVIDES:${PN} += "wvkbd"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
