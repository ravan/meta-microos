SUMMARY = "Read an argument into a box and execute the code afterwards"
DESCRIPTION = "The package provides the command \\grabbox, which grabs an \
argument into a box and executes the code afterwards."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn65223"

RPM_NAME = "texlive-grabbox-2026.226.1.4svn65223-60.4.noarch.rpm"
RPM_HASH = "5bbc275e2cd73b61d0f595d95867ac76987837fca35791e6ba966cc67a704269dae60d27d9f3f36ca253d8f5531bfa4dda9c694f2952d92119a4efbcf2d1a615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grabbox.sty \
texlive-grabbox"

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
