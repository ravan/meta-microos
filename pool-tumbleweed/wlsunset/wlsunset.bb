SUMMARY = "Day/night gamma adjustments for Wayland compositors"
DESCRIPTION = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "wlsunset-0.4.0-1.11.aarch64.rpm"
RPM_HASH = "f6f3b2e7f315f5baaeffa152d5feb4749096109cf5f82720a1422bd9bf080d69c7d19693575dedddbc40916b7440c128064c3072d55aedc647534bddcdb157db"

RPROVIDES:${PN} += "wlsunset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwayland-client.so.0"

inherit rpm
