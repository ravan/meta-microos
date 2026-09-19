SUMMARY = "Perl extension for scrubbing/sanitizing HTML"
DESCRIPTION = "If you want to 'scrub' or 'sanitize' html input in a reliable and flexible \
fashion, then this module is for you. \
 \
I wasn't satisfied with HTML::Sanitizer because it is based on \
HTML::TreeBuilder, so I thought I'd write something similar that works \
directly with HTML::Parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-HTML-Scrubber-0.19-1.31.noarch.rpm"
RPM_HASH = "44d5fbc2d7b81e58a90ef5574e6ade812887f345cac84527855c920b5744ee98640658e81377d999d85340cac038565868f8699821e2a7ef071d5ceea7869d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Scrubber \
perl-HTML-Scrubber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-List--Util"

inherit rpm
