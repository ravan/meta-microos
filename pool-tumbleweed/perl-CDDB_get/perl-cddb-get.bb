SUMMARY = "This module/script gets the CDDB info for an audio cd"
DESCRIPTION = "This module/script gets the CDDB info for an audio cd. You need LINUX, \
SUNOS or *BSD, a cdrom drive and an active internet connection in order to \
do that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.280.0"

RPM_NAME = "perl-CDDB_get-2.280.0-1.8.noarch.rpm"
RPM_HASH = "c8b8460b1965e3e3be351869f060cd9d2a109d65071b60cbde4a72013d663feab5739ef580349e7eab9b2a3d024600f85584b56f106fedf86beb5121d0f6b1e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CDDB-cache \
perl-CDDB-get"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
