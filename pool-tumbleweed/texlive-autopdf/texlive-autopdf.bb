SUMMARY = "Conversion of graphics to pdfLaTeX-compatible formats"
DESCRIPTION = "The package facilitates the on-the-fly conversion of various \
graphics formats to formats supported by pdfLaTeX (e.g. PDF). \
It uses a range of external programs, and therefore requires \
that the LaTeX run starts with write18 enabled."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32377"

RPM_NAME = "texlive-autopdf-2026.226.1.1svn32377-60.2.noarch.rpm"
RPM_HASH = "31c509550da56a1b9f48d2ea79c55ed6a1fe570a40dd6f7fabe04bc9097b5762af9db953ef96cbb0a75b92bdacb47258e24144cbdf38416c549b234f121759fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopdf.sty \
texlive-autopdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
