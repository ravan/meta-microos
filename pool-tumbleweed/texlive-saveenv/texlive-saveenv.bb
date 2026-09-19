SUMMARY = "Save environment content verbatim"
DESCRIPTION = "This package provides tools to create your own verbatim \
environments, and works for all values of \\endlinechar."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76924"

RPM_NAME = "texlive-saveenv-2026.226.0.0.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "4ec38c08ea05e5cfcfc02e212b86c303a5822c04434ae94a957156a712cc7c919089b48ba57c3eea4be932b95e9d53537c636f5a4a7aa57f801de0657bd8351e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-saveenv.sty \
texlive-saveenv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-precattl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
