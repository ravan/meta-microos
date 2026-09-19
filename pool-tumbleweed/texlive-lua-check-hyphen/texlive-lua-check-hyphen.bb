SUMMARY = "Mark hyphenations in a document, for checking"
DESCRIPTION = "The package looks at all hyphenation breaks in the document, \
comparing them against a white-list prepared by the author. If \
a hyphenation break is found, for which there is no entry in \
the white-list, the package flags the line where the break \
starts. The author may then either add the hyphenation to the \
white-list, or adjust the document to avoid the break."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn77682"

RPM_NAME = "texlive-lua-check-hyphen-2026.226.0.0.7asvn77682-59.2.noarch.rpm"
RPM_HASH = "599c0dc4ceee02689f23b1f1a92ab750fb0ca46366d7ba22dcb867d2060b2fbe85f21ef270fa0c4b7da296ad982d1484e5a14f4e12336ff2683245138c5df838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-check-hyphen.sty \
texlive-lua-check-hyphen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-keyval.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
