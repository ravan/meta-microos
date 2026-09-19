SUMMARY = "Additional EGL functions for Wayland"
DESCRIPTION = "This package provides additional functions for EGL-using programs \
that run within the Wayland framework. This allows for applications \
that need not run full-screen and cooperate with a compositor."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "libwayland-egl1-1.26.0-1.2.aarch64.rpm"
RPM_HASH = "9215ff754ff5141efa85f449a524dd9c4c62e20ee8335262821be4d80b4d324d4d96fcc4179a0716044b82f0396eac3c509e7807668f39c5013e6f5740b3964d"

RPROVIDES:${PN} += "libwayland-egl.so.1 \
libwayland-egl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
