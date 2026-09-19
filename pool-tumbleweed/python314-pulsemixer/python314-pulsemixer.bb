SUMMARY = "pulsemixer - CLI and curses mixer for PulseAudio"
DESCRIPTION = "pulsemixer - CLI and curses mixer for PulseAudio"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-pulsemixer-1.5.1-2.2.noarch.rpm"
RPM_HASH = "73918cb77eab824becefad1bee205dff58c88d236b62c0af235886b315991f6838d68868d129a526c3ec91ceaa4cdcec984db2cd31f5a9e270055c5aa3c4738c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pulsemixer \
python314-pulsemixer \
python3dist-pulsemixer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts"

inherit rpm
