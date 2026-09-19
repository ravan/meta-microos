SUMMARY = "Pass verbatim contents through a compiler and reincorporate the resulting output"
DESCRIPTION = "This package augments the fancyvrb and listings packages to \
allow the source code they contain to be checked by an external \
tool (like a compiler). The external tool's messages can be \
automatically reincorporated into the original document. The \
package does not focus on a specific programming language, but \
it is designed to work well with languages and compilers in the \
ML family."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn38300"

RPM_NAME = "texlive-checklistings-2026.226.1.0svn38300-60.2.noarch.rpm"
RPM_HASH = "eff0c66df47deb69b41068e4a493a7a668f61d1fdcbaf40bce44ea9b655ed6ee4fbf04e89e3bb0bf9dfa554934517a3da7f277583506ef7b673968d43ed45733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checklistings.sty \
texlive-checklistings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyvrb.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-listings.sty \
texlive \
texlive-checklistings-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
