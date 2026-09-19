SUMMARY = "Unload a class"
DESCRIPTION = "Unload a class"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-Class-Unload-0.120.0-1.6.noarch.rpm"
RPM_HASH = "54bd6169bf58f66231dd8f95e852fe7f5a08e93ad9d10b1e54933c91127e637ba854f71340fd0bea71c624d1d0efde3d30b7c48b239cf16ea5641582c0b11450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Unload \
perl-Class-Unload \
perl-MooseClass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Inspector"

inherit rpm
