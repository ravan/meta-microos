SUMMARY = "A firework display in obfuscated TeX"
DESCRIPTION = "The output PDF file gives an amusing display, as the reader \
pages through it."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.20120102svn25020"

RPM_NAME = "texlive-happy4th-2026.226.20120102svn25020-60.4.noarch.rpm"
RPM_HASH = "837292b2a921d4b799a128c966831b38650e5857a43cb07054ffb8bdda0ecf320663246f20469ccc4bf0e60a405568be587e729da20c1b1ba9195a8fc671ee09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-happy4th"

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
