SUMMARY = "Set-up script for PulseAudio"
DESCRIPTION = "This package contains a setup script for making PulseAudio working with \
various applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-setup-17.0-7.5.aarch64.rpm"
RPM_HASH = "92ba076f4ba46786801c6f7f9bfed152bb5a7384e524a82d29f74d972195c83e57263de96591a5946145b58fc7468f1774c246346fdfb7c9776f7c52bce2f4b3"

RPROVIDES:${PN} += "config-pulseaudio-setup \
pulseaudio-setup"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
