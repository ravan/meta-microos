SUMMARY = "Clock and map with additional information for amateur radio"
DESCRIPTION = "HamClock is a kiosk-style application that provides real time space weather, \
radio propagation models, operating events and other information particularly \
useful to the radio amateur."
LICENSE = "MIT"

PV = "4.16"

RPM_NAME = "hamclock-4.16-1.6.aarch64.rpm"
RPM_HASH = "2e27e52c18872a5fe993e412f05120b34eff0ada877489a85e703f2711a1824915afee06cf0498fb247efbe6b1fae50689808a1551b9a686715906d8dcfd0bb6"

RPROVIDES:${PN} += "hamclock"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
