SUMMARY = "Assembling beamer frames according to audience"
DESCRIPTION = "The Beamer Audience package provides macros to easily assemble \
frames according to different audiences. It enables to pick up \
the frames for a specific audience while leaving their order \
according to a logical structure in the LaTeX source."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-2026.226.0.0.1svn23427-61.2.noarch.rpm"
RPM_HASH = "fb24ccfa97f011daa5c4c4029f60eebb989c5a18a8b4ce1f6a156b4fbed1c29f7258be656a3eb9be1b5dcf0a619ba1e12a02a5889ff8da9a0eab9597f9388ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beameraudience.sty \
texlive-beameraudience"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cprotect.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
