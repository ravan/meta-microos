SUMMARY = "FM radio tuner for V4L2 supported devices"
DESCRIPTION = "Command-line utilities for adjusting the frequency and volume and \
muting of supported FM radio cards. \
 \
fm - control frequency, volume, mute/unmute of FM radio card \
fmscan - scan FM band for radio stations"
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "fmtools-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "57fd31ccb4faffb8505814aee9cde320b9d8188dd2c161143c750df456b64bda8688b6e422980029f71f0f027e5111d84c3339150e41270ea8d3a82383e26748"

RPROVIDES:${PN} += "fmtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
