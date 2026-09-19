SUMMARY = "Simple text based WSL first boot wizard"
DESCRIPTION = "Simple text based first boot wizard (adjusted for WSL) that can be used \
instead of the line based one that is built into systemd."
LICENSE = "MIT"

PV = "1.5.9+git20251110.c1fca4e"

RPM_NAME = "wsl-firstboot-1.5.9+git20251110.c1fca4e-1.3.noarch.rpm"
RPM_HASH = "cffc2e9ded44025a53ccf1ec7d8de63bdde0344585c4e8aa157111d67f558f64e86f92386cfdbd2ff0474a7aa09b48a302a0174d90380f6b68d0d2fa8f1f2ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wsl-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
cracklib \
dialog \
live-langset-data \
systemd \
timezone"

inherit rpm
