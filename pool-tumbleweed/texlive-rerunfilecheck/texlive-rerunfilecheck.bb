SUMMARY = "Checksum based rerun checks on auxiliary files"
DESCRIPTION = "The package provides additional rerun warnings if some \
auxiliary files have changed. It is based on MD5 checksum \
provided by pdfTeX, LuaTeX, XeTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn77682"

RPM_NAME = "texlive-rerunfilecheck-2026.226.1.11svn77682-60.4.noarch.rpm"
RPM_HASH = "921c2f48934c58f50629b3066310f84784a8b6fa3479a09b8f527be05fea6bfc54ddbe9b9ee636d9f69c61fcc38c2d72f599bb9b50adaeed6caaf66d07cabf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rerunfilecheck.sty \
texlive-rerunfilecheck"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-uniquecounter.sty \
texlive \
texlive-atveryend \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-uniquecounter"

inherit rpm
