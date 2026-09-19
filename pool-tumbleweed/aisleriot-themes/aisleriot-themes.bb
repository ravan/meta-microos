SUMMARY = "Extra themes for the Aisleriot solitaire card game program"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games. \
 \
This package provides extra themes for Aisleriot."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.35"

RPM_NAME = "aisleriot-themes-3.22.35-3.4.noarch.rpm"
RPM_HASH = "0a9a3089d0eb3492ad7f3e98b39b449d73ccbb7569746c5132f06f22c477f3f2c306506d5b4cb5a17547ca7c7422883c0aa621b09ac18c836bc9384dcba694e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aisleriot-themes"

RDEPENDS:${PN} += "aisleriot"

inherit rpm
