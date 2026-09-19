SUMMARY = "Remote tape drive control server by GNU"
DESCRIPTION = "Provides remote access to files and devices for tar, cpio \
and similar backup utilities"
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-rmt-1.35-10.1.aarch64.rpm"
RPM_HASH = "4caa906371cd97ecb2dc6781d5c3422610dce787c1e8a2a4ba9d6a90f9bf978ab3f7fe0e01b33d65392c2117e79944ffbeaa807f274e1effee27c223fc09b364"

RPROVIDES:${PN} += "rmt \
tar-rmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
