SUMMARY = "Baekmuk Korean TrueType fonts"
DESCRIPTION = "This bundle consists of four Korean fonts: batang.ttf: serif \
dotum.ttf: sans-serif gulim.ttf: sans-serif (rounded) \
hline.ttf: headline These fonts were originally retrieved from \
http://kldp.net/baekmuk/ and are no longer maintained."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-2026.226.2.2.1svn56915-60.2.noarch.rpm"
RPM_HASH = "02e94e23a38d65e3762459edca1fbca7719a069b780130f637cab2fa8123f522503f81286c8b0b2fe4c2247e0a69c8f07d4e5c331a50df6c977d940ee4a72710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-baekmuk-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
