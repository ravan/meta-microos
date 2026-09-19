SUMMARY = "LaTeX FAQ by the Chinese TeX Society (ctex.org)"
DESCRIPTION = "Most questions were collected on the bbs.ctex.org forum, and \
were answered in detail by the author."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ctex-faq-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "e6d311a18fc66bdbb2f142bb3b35b7bdb25e618a9b4c3bc61d4a42ad36aded41a45dcc3e5ac8f341f62badfb4f7ae0a9a7a84f702d5b4020aff13fc10dce5655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctex-faq"

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
