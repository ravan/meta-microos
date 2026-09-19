SUMMARY = "Use citation keys from a different document"
DESCRIPTION = "The package xcite is no longer necessary, because its \
functionality has been taken over by xr, so this final version \
is just a stub that loads xr."
LICENSE = "LPPL-1.0"

PV = "2026.226.16383.99998svn77682"

RPM_NAME = "texlive-xcite-2026.226.16383.99998svn77682-59.4.noarch.rpm"
RPM_HASH = "b38dc9f0831519290c3439094db3e94079ddfd9852b89b07901957f8da0d5a3ffafea5540aa9da7b69ef13df87755a0a4df9a9681c8a5262a60fd0145aa0196e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcite.sty \
texlive-xcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
