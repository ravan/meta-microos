SUMMARY = "Faster implementation of HTTP::Headers"
DESCRIPTION = "HTTP::Headers::Fast is a perl class for parsing/writing HTTP headers. \
 \
The interface is same as HTTP::Headers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.220.0"

RPM_NAME = "perl-HTTP-Headers-Fast-0.220.0-1.5.noarch.rpm"
RPM_HASH = "cd08978a483fe4b5e121f2eec7c907f9eeb52de50d211273db984e05ee92817d02b0a35bd86e104bdeaee563dafeb73eab2ea43eecc19a4ab56a24646d8a7098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Headers--Fast \
perl-HTTP-Headers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Date"

inherit rpm
