SUMMARY = "Expand acronyms at least once"
DESCRIPTION = "This package ensures that all acronyms used in the text are \
spelled out in full at least once. It also provides an \
environment to build a list of acronyms used. The package is \
compatible with pdf bookmarks. The package requires the suffix \
package, which in turn requires that it runs under e-TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.50svn78101"

RPM_NAME = "texlive-acronym-2026.226.1.50svn78101-61.2.noarch.rpm"
RPM_HASH = "d12edc6977e38a28790fbd588f5376c159f6d514a47de9e67b5ff8d38169ef560ffb24056542d2ff446448c47d4bb459059dc36fdb95b14c77ed15f364989433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acronym.sty \
texlive-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-suffix.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
