SUMMARY = "A bundle of miscellaneous footnote packages"
DESCRIPTION = "Contains three packages: - pfnote to number footnotes per page; \
- fnpos to control the position of footnotes; and - dblfnote to \
make footnotes double-columned."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48568"

RPM_NAME = "texlive-yafoot-2026.226.1.1svn48568-59.4.noarch.rpm"
RPM_HASH = "39916ff15ba9b83a56bb63792cf2525b3876d7e279f8e71e6db44b17fa687ca5aa26e3c334a39bdb74136685fb14bf44359fe4f493d11a96895457bc13b997e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dblfnote.sty \
tex-fnpos.sty \
tex-pfnote.sty \
texlive-yafoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
