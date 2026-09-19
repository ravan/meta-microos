SUMMARY = "Perl extension for checking the open or closed status of a port."
DESCRIPTION = "You can use it to check if a port is open or closed for a given host and \
protocol."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-IO-Socket-PortState-0.03-3.42.noarch.rpm"
RPM_HASH = "4fd28d6908c6c588769469b6569f310c644515fc91384cea7a94268cfb916459131c7456b949f2a9b2f0ed0e341edf313e930811473fc0995279d8d313416c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Socket--PortState \
perl-IO-Socket-PortState"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
