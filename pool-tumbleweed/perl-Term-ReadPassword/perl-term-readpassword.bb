SUMMARY = "Term::ReadPassword - Asking the user for a password"
DESCRIPTION = "This module lets you ask the user for a password in the traditional \
way, from the keyboard, without echoing. \
 \
This is not intended for use over the web; user authentication over the \
web is another matter entirely. Also, this module should generally be \
used in conjunction with Perl's crypt() function, sold separately. \
 \
 \
 \
Authors: \
-------- \
    Tom Phoenix <rootbeer@redcat.com>"
LICENSE = "Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Term-ReadPassword-0.11-69.46.aarch64.rpm"
RPM_HASH = "d21d3ebe367eb3c32befa597dc531a1192e1412dd11c06309eb83b880d26b6ac3b94aef2fe5cbd53e61ff558b3694ab299c882380bcc67eb1b49b39a78eec697"

RPROVIDES:${PN} += "perl-Term--ReadPassword \
perl-Term-ReadPassword"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
