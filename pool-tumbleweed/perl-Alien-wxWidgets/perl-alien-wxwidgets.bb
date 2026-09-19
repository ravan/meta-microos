SUMMARY = "Building, finding and using wxWidgets binaries"
DESCRIPTION = "Please see Alien for the manifesto of the Alien namespace. \
 \
In short 'Alien::wxWidgets' can be used to detect and get configuration \
settings from an installed wxWidgets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.690.0"

RPM_NAME = "perl-Alien-wxWidgets-0.690.0-1.9.aarch64.rpm"
RPM_HASH = "5f6ac4f781abf3a0ae9834cf36ee0f24efb2091785b52c19e7e517818d007c3b51d9b4b425406e8b0cb1c88064647c793e114e382360f03bbe730bf50c040e30"

RPROVIDES:${PN} += "perl-Alien--wxWidgets \
perl-Alien--wxWidgets--Utility \
perl-Alien-wxWidgets"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Pluggable"

inherit rpm
