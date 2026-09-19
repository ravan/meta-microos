SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hda-verb is a small program to send HD-audio commands to the given \
ALSA hwdep device on the hd-audio interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "hda-verb-0.4-29.4.aarch64.rpm"
RPM_HASH = "1e6297f953aa511922ccb5a4fe45cb9f57cfaae620732cbe7f8b84a1853229bfa56f7c58b1baa826ab252a87541a349841af09792d132768a4d91e089cb5a6dc"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/hda-verb \
hda-verb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
