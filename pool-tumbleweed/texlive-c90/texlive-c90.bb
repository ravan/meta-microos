SUMMARY = "C90 font encoding for Thai"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn60830"

RPM_NAME = "texlive-c90-2026.226.svn60830-59.2.noarch.rpm"
RPM_HASH = "a9b2dc152994971416a2c57a03869fe66f8a23753d1a4abf808dad475bb5bd2ef5660060ad6352c135d5665ebee15b971a8ea088d432318de15d7a3fe156602f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-c90.enc \
texlive-c90"

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
