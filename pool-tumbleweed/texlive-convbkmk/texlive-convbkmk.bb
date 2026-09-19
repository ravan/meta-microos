SUMMARY = "Correct platex/uplatex bookmarks in PDF created with hyperref"
DESCRIPTION = "The package provides a small Ruby script that corrects \
bookmarks in PDF files created by platex/uplatex, using \
hyperref."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-2026.226.0.0.30svn49252-61.2.noarch.rpm"
RPM_HASH = "fcf7188a4930d19cd79c5f7ed97ca4c77c7f8fd1ff7d277b1605b2960a90ca798c4662129e2d36994de3abd2bf3f2804234c8e7c90512790fbfe2da5ec1c9073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-convbkmk-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
