SUMMARY = "Quote and refer to a manuscript for minor revisions"
DESCRIPTION = "The package supports those who publish articles in \
peer-reviewed journals. In the final stages of the review \
process, the authors typically have to provide an additional \
document (such as a letter to the editors), in which they \
provide a list of modifications that they made to the \
manuscript. The package automatically provides line numbers and \
quotations from the manuscript, for this letter. The package \
loads the package lineno, so (in effect) shares lineno's \
incompatibilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32165"

RPM_NAME = "texlive-minorrevision-2026.226.1.1svn32165-61.2.noarch.rpm"
RPM_HASH = "fd4bd8b68fd8ac51b492dee251e7540ff3c9d21fcb43f703fda8ba75c8a2cfff9385852f8ce9cb2e6b92d59793334212c88e92e58df175c3e8c032d8f66596ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minorrevision.sty \
texlive-minorrevision"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lineno.sty \
tex-xkeyval.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
