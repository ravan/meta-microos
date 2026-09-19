SUMMARY = "Widget to display information about the current song in mpd"
DESCRIPTION = "Displays information about the current song in mpd (via mpc) \
 \
Takes two parameters: \
  * mpd.format: Format string for the song information. Tag values can \
    be put in curly brackets (i.e. {artist}) \
  * mpd.host: MPD host to connect to. (mpc behaviour by default)"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-mpd-2.1.5-4.7.noarch.rpm"
RPM_HASH = "1e12d258762f9aee3ba65288e12cc038d20287fced6a860070a2f7fbea1a064747f400b1db69553fc608976e6ea537ee063be7ac3b777cc8c8f2da5e1ca04a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-mpd"

RDEPENDS:${PN} += "bumblebee-status \
mpclient"

inherit rpm
