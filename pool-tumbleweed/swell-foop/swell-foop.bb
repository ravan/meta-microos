SUMMARY = "Same Game for GNOME"
DESCRIPTION = "Swell Foop is a puzzle game, of which the objective is to clear the \
window of as many pieces as possible by clicking on groups of the same \
colored pieces. That group will vanish and the pieces on top will fall \
until there are none left or no more color groups."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "swell-foop-50.0-1.3.aarch64.rpm"
RPM_HASH = "9b3750e9f9f0f047f8c40d38871ac75512e8a1216ccd43af3e55f41249b6a9a444782f0a4c28e7439095971c98fc8a3af986c21db40a51909dcf3597cf44d6dd"

RPROVIDES:${PN} += "swell-foop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
