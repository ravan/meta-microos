SUMMARY = "Print debug info about ops"
DESCRIPTION = "See _ext/B/README_ and the newer B::Concise."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.260.0"

RPM_NAME = "perl-B-Debug-1.260.0-1.7.noarch.rpm"
RPM_HASH = "9d34250eaf634f2dcf76a1bf3c0443fb814b89e04331f5aed1be4c1591d0bc6c03e88dd2c37a59f7c48fc9f8774a11a4ac6c8401ac3ecb6d741b7a3a81843cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Debug \
perl-B-Debug"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-deprecate"

inherit rpm
