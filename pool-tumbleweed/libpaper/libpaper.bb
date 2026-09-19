SUMMARY = "Enables users to indicate their preferred paper size"
DESCRIPTION = "This package enables users to indicate their preferred paper \
size, provides the libpaper(1) utility to find the user's preferred \
default libpaper size and give information about known sizes, and \
specifies system-wide and per-user libpaper size catalogues, which can be \
can also be used directly (see libpaperspecs(5))."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libpaper-2.2.8-1.3.aarch64.rpm"
RPM_HASH = "1a3972f5316f023909686fb39a42ecb6c45763f2343e8e38c93d291c80e207678a8c06792f0b759650e1f88d5084e4268c73c793ce4c8e7d621a269a3c4483f0"

RPROVIDES:${PN} += "config-libpaper \
libpaper \
paper-/etc/paperspecs"

RDEPENDS:${PN} += ""

inherit rpm
