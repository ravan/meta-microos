SUMMARY = "Qt bindings for PulseAudio"
DESCRIPTION = "Pulseaudio-Qt is a library providing Qt bindings to PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "libKF6PulseAudioQt5-1.8.1-1.4.aarch64.rpm"
RPM_HASH = "6b314bfa23174728241a613666cb398539b8a5cfaadd2a83777f4caf49ac98d2c014d9ead070dc7bd213c753484a3fe972ca91b5018228e17f05bafc0755e6c5"

RPROVIDES:${PN} += "libKF6PulseAudioQt.so.5 \
libKF6PulseAudioQt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
