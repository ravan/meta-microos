SUMMARY = "Storing information for reuse"
DESCRIPTION = "The package provides 'store boxes' whose user interface matches \
that of normal LaTeX 'save boxes', except that the content of a \
store box appears at most once in the output PDF file, however \
often it is used. The present version of the package supports \
pdfLaTeX and LuaLaTeX; when DVI is output, store boxes behave \
the same as save boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-storebox-2026.226.1.3asvn77682-64.2.noarch.rpm"
RPM_HASH = "0f8dd7dfe1bf82ead07d29c9997cb5523c7aafae55cce34c7b545d980d4c48469da105a15ffea186a4ea5d1a918e1662c1b6dc91831d29b67e0030574e55e89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-storebox-pgf.sty \
tex-storebox.sty \
texlive-storebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-collectbox.sty \
tex-ifpdf.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
