SUMMARY = "Development files and documentation for nbdkit"
DESCRIPTION = "This package contains development files and documentation \
for nbdkit.  Install this package if you want to develop \
plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-devel-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "720eff8ef8e7fca8e894d20ff08ef6e3321bbdfd113037e798a515a24c6464ee566b4c55e3d04946edbca444bbd7e6ca3a9bdba8381b4b172c6dbfe129cf2954"

RPROVIDES:${PN} += "nbdkit-devel \
pkgconfig-nbdkit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nbdkit-server \
pkgconfig"

inherit rpm
