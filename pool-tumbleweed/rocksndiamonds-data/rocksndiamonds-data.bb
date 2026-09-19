SUMMARY = "Data files for Rocks'n'Diamonds"
DESCRIPTION = "This is a nice little game with color graphics and sound for your Unix system \
with color X11.  You need an 8-Bit color display or better.  It will not work \
on black&white systems, and maybe not on gray scale systems. \
 \
If you know the game Boulder Dash (Commodore C64) or Emerald Mine (Amiga), \
you know what Rocks'n'Diamonds is about. \
 \
Data files (levels, tapes, graphics, music, sound) for Rocks'n'Diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "20260628"

RPM_NAME = "rocksndiamonds-data-20260628-1.2.noarch.rpm"
RPM_HASH = "f36b01ace1824664a3bbcf577d797760f075030509c63fe717e3fdba8bdeee0e04abf201d7739c2f337a208033dc48b38302090312fe65b353d26f59e66688a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rocksndiamonds-data"

RDEPENDS:${PN} += "/usr/bin/sh \
rocksndiamonds"

inherit rpm
