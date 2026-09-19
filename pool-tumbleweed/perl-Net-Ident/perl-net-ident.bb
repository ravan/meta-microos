SUMMARY = "Lookup the username on the remote end of a TCP/IP connection"
DESCRIPTION = "You can either use the simple interface, which does one ident lookup at a \
time, or use the asynchronous interface to perform (possibly) many \
simultaneous lookups, or simply continue serving other things while the \
lookup is proceeding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.310.0"

RPM_NAME = "perl-Net-Ident-1.310.0-1.3.noarch.rpm"
RPM_HASH = "9f741b508c10452ef2f4df785d8aafc7e9b4d41bde949935447e66d45e3d0d998b86d4a9bf6e974eaca3ab47dfad7dfc327bba13a39ef24fc00d56eb69dcac08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Ident \
perl-Net-Ident"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
