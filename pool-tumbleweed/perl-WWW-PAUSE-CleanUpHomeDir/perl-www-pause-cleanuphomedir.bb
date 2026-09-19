SUMMARY = "The module to clean up old dists from your PAUSE home directory"
DESCRIPTION = "The module provides means to clean up your PAUSE home directory from old \
distributions with ability to undelete files if you so prefer."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001003"

RPM_NAME = "perl-WWW-PAUSE-CleanUpHomeDir-1.001003-1.1.noarch.rpm"
RPM_HASH = "f7e6ce4eaf6d56598e1501ddb69d57c4f49b333b0baf9515eda5cf9be8cb70de95b712a51ed1b21a28257d17a54c01b67dc312e3483041a055bbffe4416e66ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--PAUSE--CleanUpHomeDir \
perl-WWW-PAUSE-CleanUpHomeDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Grouped \
perl-Devel--TakeHashArgs \
perl-HTML--TokeParser--Simple \
perl-Sort--Versions \
perl-URI \
perl-WWW--Mechanize"

inherit rpm
