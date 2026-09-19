SUMMARY = "American ispell dictionary"
DESCRIPTION = "This package includes a ready American dictionary for ispell. If you \
install ispell-british too, check /etc/sysconfig/ispell to see which \
one the default English dictionary will be. A short usage description \
is given in /usr/share/doc/packages/ispell/README. The sources for this \
dictionary are included in the source package of ispell."
LICENSE = "BSD-3-Clause"

PV = "3.4.06"

RPM_NAME = "ispell-american-3.4.06-5.1.aarch64.rpm"
RPM_HASH = "994d0bc11486ac7a5d1a334c7019210ef19d004114faf99c9b92d27b6c29259971f3eadf0343522ba21b9081f3c98a2924c655d3250f3aaf29f6b168200c022d"

RPROVIDES:${PN} += "iamerica \
ispell-american \
ispell-dictionary \
ispell-english-dictionary \
locale-ispell-en"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
fileutils \
ispell"

inherit rpm
