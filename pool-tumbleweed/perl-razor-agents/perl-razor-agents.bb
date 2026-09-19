SUMMARY = "The required perl modules for razor-agents"
DESCRIPTION = "razor-agents are little programs to retrieve or update information \
from the razor <http://razor.sourceforge.net/> network to exchange \
signatures of SPAM. This package contains the required perl modules."
LICENSE = "Artistic-1.0"

PV = "2.86"

RPM_NAME = "perl-razor-agents-2.86-1.23.aarch64.rpm"
RPM_HASH = "dab6c29106967538fb18c891c6d6922a4e07b4ba007aa90d1a94ee21753d99b6a3b95374ff2326a5d355f23a9d460ed86037af1b5cb103ca1f7e13fb69d89800"

RPROVIDES:${PN} += "perl-Razor2--Client--Agent \
perl-Razor2--Client--Config \
perl-Razor2--Client--Core \
perl-Razor2--Client--Engine \
perl-Razor2--Client--Version \
perl-Razor2--Engine--VR8 \
perl-Razor2--Errorhandler \
perl-Razor2--Logger \
perl-Razor2--Preproc--Manager \
perl-Razor2--Preproc--deBase64 \
perl-Razor2--Preproc--deHTML \
perl-Razor2--Preproc--deHTML-comment \
perl-Razor2--Preproc--deHTMLxs \
perl-Razor2--Preproc--deNewline \
perl-Razor2--Preproc--deQP \
perl-Razor2--Preproc--enBase64 \
perl-Razor2--Signature--Ephemeral \
perl-Razor2--Signature--Whiplash \
perl-Razor2--String \
perl-Razor2--Syslog \
perl-razor-agents"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl-Digest-SHA1 \
perl-URI"

inherit rpm
