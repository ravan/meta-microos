SUMMARY = "Suppress hyper links when printing"
DESCRIPTION = "This package provides the command \\hrefdisplayonly \
(additionally to \\href provided by the hyperref package). While \
the (hyperlinked) text appears like an ordinary \\href in the \
compiled pdf-file, the same text will be 'hidden' when printing \
the text. Hiding is actually achieved by making the text the \
same colour as the background, thus preserving the layout of \
the rest of the text. Further the commands \\hycon and \\hycoff \
(hyper-colour-on/off) can be used to simulate switching option \
ocgcolorlinks of the hyperref package on and off. This package \
is possibly obsolete, see section 3: 'Alternatives' in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn73641"

RPM_NAME = "texlive-hrefhide-2026.226.1.1bsvn73641-60.4.noarch.rpm"
RPM_HASH = "94ad9f861a4778a39c757163b55a6a587519ca41a939a9e5c65913a3b3bbebba0392701e7f944f3f3e1a6700220d3a86f1f7a4ffa78e6863ea2fd459f328c108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hrefhide.sty \
texlive-hrefhide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
