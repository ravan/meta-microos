SUMMARY = "Synthesize keyboard and mouse input on X11 and Wayland with various backends"
DESCRIPTION = "Synthesize keyboard and mouse input on X11 and Wayland with various backends."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "libinputsynth-devel-0.15.0-1.15.aarch64.rpm"
RPM_HASH = "26d36f326176e2b2100ad1069a3a8d3ebb3be89f1a29bd42dce16c6a8249842963e4c0c0ef15dde4230330ea318b574bb41e16b0de30b6261a8a0681bdc7c75d"

RPROVIDES:${PN} += "libinputsynth-devel \
pkgconfig-libinputsynth-0.15"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinputsynth0-15-0 \
pkgconfig-glib-2.0"

inherit rpm
