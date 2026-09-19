SUMMARY = "A set of utilities for joysticks"
DESCRIPTION = "This package contains the following utilities and associated \
documentation: \
* joystick utilities - calibrate and test joysticks and joypads \
 \
The following utilities are provided to calibrate and test joysticks: \
* evdev-joystick - test & calibrate joysticks using evdev devices \
* ffcfstress, ffmvforce, fftest - test force-feedback devices \
* ffset - set force-feedback device parameters \
* jscal - calibrate joystick devices, reconfigure the axes and buttons \
* jscal-store, jscal-restore - store and retrieve joystick device settings as configured using jscal \
* jstest - test joystick devices"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "linuxconsoletools-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "7204b804d220d4ad25df5bebe97ff37ac6feada368f448b7344974b7675359e4c9d4bff60bed3d02382f539f9a76aa116beb9b2a62df5db816623b3007bccec0"

RPROVIDES:${PN} += "input-utils \
linuxconsoletools"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
