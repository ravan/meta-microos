SUMMARY = "Generate Japanese-style crop marks"
DESCRIPTION = "This bundle provides a LaTeX package for generating \
Japanese-style crop marks (called 'tombow' in Japanese) for \
practical use in self-publishing. The bundle contains the \
following packages: gentombow.sty: Generate crop marks (called \
'tombow' in Japanese) for practical use in self-publishing. It \
provides the core 'tombow' feature if not available. \
pxgentombow.sty: Superseded by gentombow.sty; kept for \
compatibility only. bounddvi.sty: Set papersize special to DVI \
file. Can be used on LaTeX/pLaTeX/upLaTeX (with DVI output \
mode) with dvips or dvipdfmx drivers."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gentombow-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "b15ae9dcf11bbd096276fbc91166bc6c04da5456aebe97c880a2cf3c790c8b529fec307590a4590a8116ec5300dd7f9604f207e464c918ec571247d99b9b9f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bounddvi.sty \
tex-gentombow.sty \
tex-pxesopic.sty \
tex-pxgentombow.sty \
tex-pxpdfpages.sty \
tex-pxtextpos.sty \
texlive-gentombow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-pdfpages.sty \
tex-pxatbegshi.sty \
tex-pxeveryshi.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
