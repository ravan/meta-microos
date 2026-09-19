SUMMARY = "Persian (Farsi) introduction to LaTeX"
DESCRIPTION = "A Persian (Farsi) translation of Oetiker's (not so) short \
introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.5.01svn31296"

RPM_NAME = "texlive-lshort-persian-2026.226.5.01svn31296-61.2.noarch.rpm"
RPM_HASH = "092a8b4a6012248b2f0cf70019f2daa594c7d68f93da70081b62e5b6179fcff668cbba8fdb724fa755e9c2b5dc61b5cefec5b35742b8b16fe90c32a2dbed49ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-persian"

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
