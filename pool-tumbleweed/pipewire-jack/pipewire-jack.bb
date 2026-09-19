SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-jack-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "9339b2ea0d541e4840c923ee395554712b179687461689a50ba94d164fd84aa30ab23f41a486a5f8b06f92c33671724216efefa76f9e12509651d4b9d69022f5"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
