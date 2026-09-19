SUMMARY = "Asymptote FAQ (Chinese translation)"
DESCRIPTION = "This is a Chinese translation of the Asymptote FAQ"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-asymptote-faq-zh-cn-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "f1ca46a2d2946a51a079e740f4d0f3bff7bc1ee80ab7ee96e8120dd2e76c36ff154a165f459e3f4cf29f9bb6d97d89b863039004fac8f2a65bd6b074d6789839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-faq-zh-cn"

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
