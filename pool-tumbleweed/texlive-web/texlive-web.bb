SUMMARY = "The original literate programming system"
DESCRIPTION = "The system processes 'web' files in two ways: firstly to \
rearrange them to produce compilable code (using the program \
tangle), and secondly to produce a TeX source (using the \
program weave) that may be typeset for comfortable reading."
LICENSE = "SUSE-TeX"

PV = "2026.226.4.5svn77830"

RPM_NAME = "texlive-web-2026.226.4.5svn77830-60.2.noarch.rpm"
RPM_HASH = "be94b519366eb56f6c0a58aaa00f80494005f4a4dcd3152083587893f21c680b9d3b9db08c3d43a73ce2d5578c395e1fcc15ed1a1c5feb55f17b8fb6492551a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tangle.1 \
man-weave.1 \
texlive-web"

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
texlive-scripts-bin \
texlive-web-bin"

inherit rpm
