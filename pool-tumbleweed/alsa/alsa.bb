SUMMARY = "Advanced Linux Sound Architecture"
DESCRIPTION = "ALSA stands for Advanced Linux Sound Architecture.  It supports many \
PCI, ISA PnP  and USB sound cards. \
 \
This package contains the ALSA init scripts to start the sound system \
on your Linux box.  To set it up, run yast2 or alsaconf."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.16.1"

RPM_NAME = "alsa-1.2.16.1-2.1.aarch64.rpm"
RPM_HASH = "da4ef3f9f5dd554a24ca3d4e0b962bef752e4928cfea35707ae08cdddbf9db78e76eea7e1caf0d93b24d27948bab882e24619d4185bc3e3c8fb87c89f47c6d6c"

RPROVIDES:${PN} += "alsa"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
alsa-ucm-conf \
alsa-utils \
fillup"

inherit rpm
