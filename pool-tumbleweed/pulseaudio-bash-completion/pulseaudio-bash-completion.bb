SUMMARY = "PulseAudio Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for various PulseAudio utilities"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "17.0"

RPM_NAME = "pulseaudio-bash-completion-17.0-7.5.aarch64.rpm"
RPM_HASH = "c93273ec2cdd2ccf75fec6734fd9a243d36177f2fc2c35647556748632061057496386b46621fd04004804e648cfbd5ce93f2e6d17e1223a3950966a5c2c9135"

RPROVIDES:${PN} += "pulseaudio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pulseaudio-utils"

inherit rpm
