SUMMARY = "Daemon for automatic killing of login shells"
DESCRIPTION = "KillerD is a simple daemon for automatic killing of login shells with \
idle time exceeding given limits, runaway processes and other system \
hogs. Almost everything can be easily configured."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "killerd-1.1-127.9.aarch64.rpm"
RPM_HASH = "47f3ff4d238f096514c5413bf83b94d4a35bf1421acddfc980c6a5b17c5a9c3edea24ee6f5ba692e84a9f2cc160e14dda0e038c5957f659dd0ebba166fdb5b02"

RPROVIDES:${PN} += "config-killerd \
killerd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
