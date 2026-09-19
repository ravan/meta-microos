SUMMARY = "GStreamer modules and libraries for videoconferencing -- Codec preferences"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package contains data (codec preferences, element properties) \
used by the library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-data-0.2.9+5-3.3.noarch.rpm"
RPM_HASH = "f50e5221812ed23cc39c95de52eec5954994935e6305aafbdca14b4a0a6e8eef0ea193a46a135faae1ebb8669aaa7ab92feea83885b649d5d111efc1e22a1695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "farstream-data"

RDEPENDS:${PN} += ""

inherit rpm
