SUMMARY = "Development files for rtmidi"
DESCRIPTION = "C++ library for realtime MIDI input/ouput. \
 \
This package contains header files and libraries needed to develop \
application that use rtmidi."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "rtmidi-devel-6.0.0-2.11.aarch64.rpm"
RPM_HASH = "b5fc94b9dfb0d669266f0f332a2d83020ced6bba56c4a70d3fb10e46b991300a30e1a8f468a1060dff805be4ca37bc99b20c3a00bbf7b9e00dda1f78bbac2244"

RPROVIDES:${PN} += "cmake-rtmidi \
pkgconfig-rtmidi \
rtmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
librtmidi7 \
pkgconfig-alsa \
pkgconfig-jack"

inherit rpm
