SUMMARY = "COSMIC OSD"
DESCRIPTION = "COSMIC OSD."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-osd-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "d5a4d65469bf566044429a24de1ea535800e72a45c094d0bb718995539d8735d3cdacd9545216fb60b334e13d9161a8208bbea1fa62f3262ee038810cace31c1"

RPROVIDES:${PN} += "cosmic-osd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
