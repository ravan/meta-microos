SUMMARY = "Chronos is a simple Pomodoro timer"
DESCRIPTION = "Chronos is a simple Pomodoro timer."
LICENSE = "GPL-3.0-only"

PV = "0.1.5+17"

RPM_NAME = "chronos-0.1.5+17-1.9.aarch64.rpm"
RPM_HASH = "96b74dbbff42032b2b320a77e98b0955359223edb991d691b52e2f080f1ce9add5689715ddeb76c795a3142dc8829883cf3200c4d079ad4c9444256c21c907ad"

RPROVIDES:${PN} += "chronos"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
