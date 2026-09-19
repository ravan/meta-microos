SUMMARY = "Development package for the fluidsynth library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
fluidsynth library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "fluidsynth-devel-2.6.0-2.1.aarch64.rpm"
RPM_HASH = "c5b8c8eb5f79b1fd6cf0c16ce29eeda113132ed7f96b073f28112e47c9325c92f561354bf73c9c481300b75205595e0f03392a3dae44ee8287494876acdcee18"

RPROVIDES:${PN} += "cmake-FluidSynth \
fluidsynth-devel \
libfluidsynth-devel \
pkgconfig-fluidsynth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fluidsynth \
glibc-devel \
libfluidsynth3 \
pkgconfig-alsa \
pkgconfig-jack \
pkgconfig-libpipewire-0.3 \
pkgconfig-libpulse-simple \
pkgconfig-libsystemd \
pkgconfig-readline \
pkgconfig-sdl3 \
pkgconfig-sndfile"

inherit rpm
