SUMMARY = "Some macros for writing practical reports"
DESCRIPTION = "This package provides a handful of macros for writing up \
science practical reports."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-2026.226.2.0.3svn52312-59.2.noarch.rpm"
RPM_HASH = "50f647594a68fb675dbd9eb6b103dc516b614e7768ceb546a7f3ffdb7c1f698a8b3e3ee1aaeaa34fedf773dc29d025554663775e70abee6a615082334aa2a764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-practicalreports.sty \
texlive-practicalreports"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-pdfpages.sty \
tex-pgffor.sty \
tex-scrextend.sty \
tex-tikzducks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
