SUMMARY = "Installed tests for pipewire"
DESCRIPTION = "Installed tests for PipeWire, compatible with gnome-desktop-testing-runner. \
Run with: gnome-desktop-testing-runner pipewire-0.3"
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-tests-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "e17984f4f7aa605d727fb2b5b18d54c41ab43631641386e561cd3efec63ef3c9f3bf419b0025bdc6b47b51417ac0e63978eacc831a374fcbd3aa4c7d7d890c9c"

RPROVIDES:${PN} += "pipewire-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
libsndfile.so.1 \
libspa-audioconvert.so"

inherit rpm
