SUMMARY = "Set up a CGI environment from an HTTP::Request"
DESCRIPTION = "Provides a convenient way of setting up an CGI environment from an \
HTTP::Request."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.200.0"

RPM_NAME = "perl-HTTP-Request-AsCGI-1.200.0-1.9.noarch.rpm"
RPM_HASH = "40a5b3acbaa5c55a7b03387091effea5137f156125b0e1669e247cd54a4ea6f197a36a37c6ddc541792640f13b80f36ef7ea619e5f07a14dcb7fec4eaef162d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Request--AsCGI \
perl-HTTP-Request-AsCGI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-HTTP--Request \
perl-HTTP--Response \
perl-URI--Escape"

inherit rpm
