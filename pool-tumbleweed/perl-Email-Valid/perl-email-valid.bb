SUMMARY = "Check validity of Internet email addresses"
DESCRIPTION = "This module determines whether an email address is well-formed, and \
optionally, whether a mail host exists for the domain. \
 \
Please note that there is no way to determine whether an address is \
deliverable without attempting delivery (for details, see at \
http://perldoc.perl.org/perlfaq9.html#How-do-I-check-a-valid-mail-address)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.204.0"

RPM_NAME = "perl-Email-Valid-1.204.0-1.12.noarch.rpm"
RPM_HASH = "9cc7388cef6ed229d3634b4b9ed5dbc38e339b31a52c5ebccdce80b8168fba0024be80e9ab2d58ea01716b035974311638978336dae2db5207584c3358908466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Valid \
perl-Email-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-Mail--Address \
perl-Net--DNS \
perl-Net--Domain--TLD"

inherit rpm
