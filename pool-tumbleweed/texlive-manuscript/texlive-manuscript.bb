SUMMARY = "Emulate look of a document typed on a typewriter"
DESCRIPTION = "This package is designed for those who have to submit \
dissertations, etc., to institutions that still maintain the \
typewriter is the summit of non-professional printing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn36110"

RPM_NAME = "texlive-manuscript-2026.226.1.7svn36110-59.2.noarch.rpm"
RPM_HASH = "f4b3d0986c4466c3c831f2080b26a5bb51be3125fcf5150cb2066421959dc77eec9a4ac374e26cc3f594cb460d9a52a564a0573792ff8a105b786903b3dddf31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manuscript.sty \
texlive-manuscript"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fullpage.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
