SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains the development environment to build applications and \
other libraries that use PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-devel-2.0.4-3.7.aarch64.rpm"
RPM_HASH = "0bab92f4344030cc6c5b9b1e3fd0bdd80724d79708473e7a8cd89979ff082465f83899f09b00adf179e4ec72b11bac595624b20d37de9df8e3b658375134aca4"

RPROVIDES:${PN} += "cmake-PortMidi \
pkgconfig-portmidi \
portmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportmidi2 \
pkgconfig-alsa"

inherit rpm
