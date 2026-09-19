SUMMARY = "RPM dependency generator for Perl"
DESCRIPTION = "Tools for packaging Perl projects with rpm"
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "perl-rpm-packaging-1.3-1.3.noarch.rpm"
RPM_HASH = "41d9f577394213b42eb7b12ef951162bf7f6d8628cbc5bf8f7c0278375d286929343ec7b19812ac8a7ce2bf102d1a7809740e66c585c492724e5ae3283aea3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-rpm-packaging \
rpm-build-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
