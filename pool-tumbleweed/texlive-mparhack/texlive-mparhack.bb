SUMMARY = "Work around a LaTeX bug in marginpars"
DESCRIPTION = "Works around the LaTeX bug that marginpars will sometimes come \
out at the wrong margin."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-mparhack-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "a385dc724cb39e0a2813626a843000151c15aa18b01dd1f76ab44e33fd9555029c4940afecf457329ce8e45eaecbf9f9a93e9e99a10d58bb4886ef2a4063fc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mparhack.sty \
texlive-mparhack"

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
