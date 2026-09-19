SUMMARY = "Parse HTTP/1.1 request into HTTP::Request/Response object"
DESCRIPTION = "This is an HTTP request parser. It takes chunks of text as received and \
returns a 'hint' as to what is required, or returns the HTTP::Request when \
a complete request has been read. HTTP/1.1 chunking is supported. It dies \
if it finds an error."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-HTTP-Parser-0.06-1.26.noarch.rpm"
RPM_HASH = "22929485ebe8e8fc16f1657ed9efca2dd75f0f1b9ab615fc1d70e5e99f4fa985d511a8f65ca5815ef5d8e5883170c7f89febe930266c5db701ef070664956ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Parser \
perl-HTTP-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Request \
perl-HTTP--Response \
perl-URI"

inherit rpm
