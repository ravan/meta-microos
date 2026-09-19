SUMMARY = "An implementation of the SPF specification"
DESCRIPTION = "libspf2 is an implementation of the SPF (Sender Policy Framework) \
specification as found at: \
http://www.ietf.org/internet-drafts/draft-mengwong-spf-00.txt \
SPF allows email systems to check SPF DNS records and make sure that \
an email is authorized by the administrator of the domain name that \
it is coming from. This prevents email forgery, commonly used by \
spammers, scammers, and email viruses/worms. \
 \
A lot of effort has been put into making it secure by design, and a \
great deal of effort has been put into the regression tests."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-2-1.2.11-8.13.aarch64.rpm"
RPM_HASH = "892a88cec62b6e4cdfaabaf5069d781b10acee6745a73d0ccaca7b31d8147b4d3543832b32803f95afd87fb9e96ca3d7e9a490c406fef01ed45b44d609e5c137"

RPROVIDES:${PN} += "libspf2-2 \
libspf2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libresolv.so.2"

inherit rpm
