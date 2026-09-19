SUMMARY = "Test the consistency of the Italian personal Fiscal Code"
DESCRIPTION = "The alphanumeric string that forms the Italian personal Fiscal \
Code is prone to be misspelled thus rendering a legal document \
invalid. The package quickly verifies the consistency of the \
fiscal code string, and can therefore be useful for lawyers and \
accountants that use fiscal codes very frequently."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-2026.226.1.2svn29803-60.2.noarch.rpm"
RPM_HASH = "8e7d1cb4f769fdfe9667835c3ba12dee267d806e50a183669865d2dcca00c0ae5ee0f8a0de21b807126ca81a334c6d9b99ab37b596c87b3e30062bcf3a730189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codicefiscaleitaliano.sty \
texlive-codicefiscaleitaliano"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
