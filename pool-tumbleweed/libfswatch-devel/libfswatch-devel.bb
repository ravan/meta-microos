SUMMARY = "Development files for fswatch"
DESCRIPTION = "Development files for fswatch a file change monitor."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.0"

RPM_NAME = "libfswatch-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "912e4b9b07c987dced15c846880ccd9b2e715e8b71f0f8933b104b44d40fbee7fca83738afb88d22ad22db849896cf73ed41caa83b17fde0b27f2da809570d14"

RPROVIDES:${PN} += "libfswatch-devel \
pkgconfig-libfswatch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfswatch15"

inherit rpm
