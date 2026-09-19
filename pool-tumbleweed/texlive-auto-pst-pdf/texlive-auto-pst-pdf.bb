SUMMARY = "Wrapper for pst-pdf (with some psfrag features)"
DESCRIPTION = "The package uses --shell-escape to execute pst-pdf when \
necessary. This makes it especially easy to integrate into the \
workflow of an editor with just 'LaTeX' and 'pdfLaTeX' buttons. \
Wrappers are provided for various psfrag-related features so \
that Matlab figures via laprint, Mathematica figures via \
MathPSfrag, and regular psfrag figures can all be input \
consistently and easily."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-auto-pst-pdf-2026.226.0.0.7svn77682-60.2.noarch.rpm"
RPM_HASH = "7b61955cb29a6e28ca29aa9a63c858337d0d2fe12fe3cd854fdd390523460e4953e9d14a491f6bfa8a44309351ab68803cd53718fe2b06798f3e452ca77f8355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf.sty \
texlive-auto-pst-pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-pst-pdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-ifplatform \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
