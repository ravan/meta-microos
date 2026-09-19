SUMMARY = "Internationalized Resource Identifiers"
DESCRIPTION = "The IRI module provides an object representation for Internationalized \
Resource Identifiers (IRIs) as defined by at \
http://www.ietf.org/rfc/rfc3987.txt and supports their parsing, \
serializing, and base resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14.0"

RPM_NAME = "perl-IRI-0.14.0-1.3.noarch.rpm"
RPM_HASH = "aa40425cc805f0f485c60989377ee149ddaaea565fafb4532a6139a7c1238c02fac414182fdb471b945e94fb0d276228117d1e639114bb3714dede1e2e29c4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IRI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-MooX--HandlesVia \
perl-Type--Tiny"

inherit rpm
