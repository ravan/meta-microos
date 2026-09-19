SUMMARY = "Japanese pTeX manual"
DESCRIPTION = "This package contains the Japanese pTeX manual. Feedback is \
welcome!"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn75173"

RPM_NAME = "texlive-ptex-manual-2026.226.svn75173-60.4.noarch.rpm"
RPM_HASH = "6d7b3714e4bc17cfaf4d9db76c6f25ec372f40aa9f2d9ebd8f497cd123c0ce4afd627192c5e7101182873e8cbc7d835de1f439f9047e552ab94ffc469550b48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-manual"

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
