SUMMARY = "Persistent Storage for Arbitrary Data (for Embperl)"
DESCRIPTION = "Apache::SessionX extends Apache::Session. It was initially written to \
use Apache::Session from inside of HTML::Embperl, but is seems to be \
useful outside of Embperl as well, so here is it as standalone module."
LICENSE = "GPL-2.0+"

PV = "2.01"

RPM_NAME = "perl-Apache-SessionX-2.01-245.8.aarch64.rpm"
RPM_HASH = "81aa526b602049f780b33a1cff04d151caf881c607e2129cfaa1ab7771c4327b01d181981d7c311baa958eecf1c76982f0d349b5d1a9caf25ef5549ed7a85ce4"

RPROVIDES:${PN} += "Apache-SessionX \
perl-Apache--SessionX \
perl-Apache--SessionX--Config \
perl-Apache--SessionX--Generate--MD5 \
perl-Apache--SessionX--Manager \
perl-Apache--SessionX--Store--File \
perl-Apache-SessionX"

RDEPENDS:${PN} += "apache2-mod-perl \
perl--MODULE-COMPAT-5.44.0 \
perl-DBI \
perl-URI"

inherit rpm
