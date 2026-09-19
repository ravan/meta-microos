SUMMARY = "Support for running PulseAudio daemon system wide"
DESCRIPTION = "PulseAudio daemon can be run as a system-wide instance which than can be shared \
by multiple local users. We recommend running the PulseAudio daemon per-user, \
just like the traditional ESD sound daemon. In some situations however, such as \
embedded systems where no real notion of a user exists, it makes sense to use \
the system-wide mode. \
 \
Before you now go ahead and use it please read about what is wrong with system \
mode: \
 \
http://www.freedesktop.org/wiki/Software/PulseAudio/Documentation/User/WhatIsWrongWithSystemWide"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-system-wide-17.0-7.5.aarch64.rpm"
RPM_HASH = "e1a8bee257c0f6fc2d3593d8e79c45751e3acf73731fcec58e9c914235051231de117f9d4c7677ab48d13285505306855e60934535a2ccc060186cefd8bdd71d"

RPROVIDES:${PN} += "pulseaudio-system-wide"

RDEPENDS:${PN} += "/usr/bin/sh \
pulseaudio \
systemd"

inherit rpm
