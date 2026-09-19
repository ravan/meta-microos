SUMMARY = "OpenTTD data"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
This package provides the data files needed by openttd or openttd-dedicated."
LICENSE = "GPL-2.0-only"

PV = "15.3"

RPM_NAME = "openttd-data-15.3-1.3.noarch.rpm"
RPM_HASH = "7415575b5666d8ba6b31e038dbabece1f8d8dbf098ee2cc975b970f1875ce4bcf37b08b035ebf82f38f4a08b76c38b2a246d2547e3e3551aba15f7070874b786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-data"

RDEPENDS:${PN} += ""

inherit rpm
