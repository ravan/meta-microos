SUMMARY = "Documentation for texlive-gnu-freefont"
DESCRIPTION = "This package includes the documentation for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn68624"

RPM_NAME = "texlive-gnu-freefont-doc-2026.226.svn68624-60.4.noarch.rpm"
RPM_HASH = "1d09c8586942243de9e3a8fb2701f7204bcc5649b55d241e2abdf6330f0ae1d43787623b6e113f86cbedff87d93e2159c2d7b4f043fbfe83973b81bd50ee67dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont-doc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh"

inherit rpm
