SUMMARY = "Thai Language Typesetting in XeLaTeX"
DESCRIPTION = "This package allows you to input Thai characters directly to \
LaTeX documents and choose any (system wide) Thai fonts for \
typesetting in XeLaTeX. It also tries to appropriately justify \
paragraphs with no more external tools. Required packages are \
fontspec, ucharclasses, polyglossia, setspace, kvoptions, \
xstring, and xpatch."
LICENSE = "LPPL-1.0"

PV = "2026.227.2021.03.01svn77682"

RPM_NAME = "texlive-thaispec-2026.227.2021.03.01svn77682-62.2.noarch.rpm"
RPM_HASH = "2fbab2ad34747434dfac6537512c54f1cdeaeb2a568c32e28436337e79c440f950a48fd655df59290e702f7899a449f117486b0a7c8ddefc04ffc2ededc4786b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thaispec.sty \
texlive-thaispec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-amsthm.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-mathspec.sty \
tex-mathtools.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-ucharclasses.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
