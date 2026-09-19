SUMMARY = "FireWire 1394 support for audio devices"
DESCRIPTION = "This package provides the libffado shared library that \
provides a unified programming interface to configure and \
use all supported devices. Currently, this library is used \
by the 'firewire' backends of the JACK Audio Connection Kit \
sound server. This backend provides audio and MIDI support, \
and is available in jackd. Access to the device internal \
configuration (e.g. internal mixer) is exposed using the \
ffado-dbus-server daemon. This daemon exposes the \
configurable parameters of all detected devices through \
DBUS. The ffadomixer application in support/mixer presents \
a GUI to control these parameters (only for officially \
supported devices)."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "libffado2-2.4.9-4.5.aarch64.rpm"
RPM_HASH = "680bfee71a5dfd05a792849ce3a4164c40720196f48d32c3164e72b6899d0c25cf5a6cbaadcdc9d953c08f2e6fda079fb0a92a83115138a4c04e20dc821b67da"

RPROVIDES:${PN} += "libffado.so.2 \
libffado2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig++.so.15 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libiec61883.so.0 \
libm.so.6 \
libraw1394.so.11 \
librom1394.so.0 \
libstdc++.so.6 \
libxml++-3.0.so.1"

inherit rpm
