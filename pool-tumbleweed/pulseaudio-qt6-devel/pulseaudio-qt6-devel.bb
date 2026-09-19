SUMMARY = "Development files for pulseaudio-qt, Qt bindings for PulseAudio"
DESCRIPTION = "Development files for pulseaudio-qt, a library providing Qt bindings to \
PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "pulseaudio-qt6-devel-1.8.1-1.4.aarch64.rpm"
RPM_HASH = "836ec68ae216eacc007f481c20891da516b6e3c2c6ffc85fbb9803da9e7124359f6bbda0c096e90dd55aa653ba7a5c15df2d03ea687b067b9bea8e05e9244069"

RPROVIDES:${PN} += "cmake-KF6PulseAudioQt \
pkgconfig-KF6PulseAudioQt \
pulseaudio-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libKF6PulseAudioQt5 \
pkgconfig-Qt6Core"

inherit rpm
