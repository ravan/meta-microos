SUMMARY = "Sndio output plugin for the C* Music Player"
DESCRIPTION = "This package provides sndio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-sndio-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "941b3b7f39473d84c6000043b30616dc788c44066531c63d82b4ae6e72f4de34ce3aa706a1833aec88ced63670aa9900c13ec99826d3adf0a958354624a7e77e"

RPROVIDES:${PN} += "cmus-plugin-sndio"

RDEPENDS:${PN} += "cmus \
libsndio.so.7"

inherit rpm
