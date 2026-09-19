SUMMARY = "Graphical User Interface for Open Babel, a chemical toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains a graphical interface for Open Babel."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "openbabel-gui-3.2.1-1.1.aarch64.rpm"
RPM_HASH = "79c33690d6a9315c84362a9b6763515f6ace0d5c8adcf8172120555bd7e3295fb95093499bc186eba58a2dbaadb1d30f34c237c971d56583de8fa0b9d0d21301"

RPROVIDES:${PN} += "openbabel-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenbabel.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
