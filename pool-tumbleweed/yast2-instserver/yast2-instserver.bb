SUMMARY = "YaST2 - Installation Server Configuration and Management"
DESCRIPTION = "This package allows you to configure an installation server suitable \
for installaing SUSE Linux over the network. Currently FTP, HTTP and \
NFS sources are supported."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "yast2-instserver-5.0.0-1.15.noarch.rpm"
RPM_HASH = "58353d9ec3f4ed264ff554f8c360331f3fb137e8fc9f37f433387d6ded7036a7350094c8c05785e72b4bb69d254146023a97cb524a780289060569899a87ce5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-instserver"

RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-ruby-bindings"

inherit rpm
