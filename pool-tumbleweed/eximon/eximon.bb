SUMMARY = "Eximon, an graphical frontend to administer Exim's mail queue"
DESCRIPTION = "This allows administrators to view the exim agent's mail queue and \
logs, and perform a variety of actions on queued messages, such as \
freezing, bouncing and thawing messages, and even editing body and \
header of mails."
LICENSE = "GPL-2.0-or-later"

PV = "4.98.2"

RPM_NAME = "eximon-4.98.2-4.7.aarch64.rpm"
RPM_HASH = "4b7a2c57220dd0a02917b1f669f356c67a9277003715f39d61ba8902934f2a3c3426c58596be52d2e29452e942e60c32b887d03014ef687c98c724c6435f966d"

RPROVIDES:${PN} += "eximon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
