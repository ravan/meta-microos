SUMMARY = "Russian introduction to LaTeX"
DESCRIPTION = "Russian version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn55643"

RPM_NAME = "texlive-lshort-russian-2026.226.svn55643-61.2.noarch.rpm"
RPM_HASH = "424bf6ec4c4ae126762359a816ded4437ff5cac1752270b5c4b37124b77814ea74cc52f6918a625dc5f32d94173e2282cdd65dc2b8fc445f4614592dfaed7d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-russian"

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
