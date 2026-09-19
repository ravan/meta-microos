SUMMARY = "Support for the revision control system"
DESCRIPTION = "A package to extract RCS (Revision Control System) information \
and use it in a LaTeX document. For users of LaTeX2HTML \
rcsinfo.perl is included."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-2026.226.1.11svn15878-60.4.noarch.rpm"
RPM_HASH = "a498219c7bc4b1d55939497a0e47462d347816684def92fcd39f0389b51d406b11cf68ce5a9f3ef2355851d517a9030c1adbfb230c29216eebe44cfb130a29ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcsinfo.cfg \
tex-rcsinfo.sty \
texlive-rcsinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
