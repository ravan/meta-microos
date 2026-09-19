SUMMARY = "pulsemixer - CLI and curses mixer for PulseAudio"
DESCRIPTION = "pulsemixer - CLI and curses mixer for PulseAudio"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-pulsemixer-1.5.1-2.2.noarch.rpm"
RPM_HASH = "60756d027f21b3aba1b2a6e572272903f77969aa0e95cdd286588bf2d5f58fc3037c35d1112b5d7254b6202b138b480805e30296a9e7e312bd142d0d5ccd125d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pulsemixer \
python3.13dist-pulsemixer \
python313-pulsemixer \
python3dist-pulsemixer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts"

inherit rpm
