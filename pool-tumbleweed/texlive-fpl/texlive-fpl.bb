SUMMARY = "SC and OsF fonts for URW Palladio L"
DESCRIPTION = "The FPL Fonts provide a set of SC/OsF fonts for URW Palladio L \
which are compatible with respect to metrics with the Palatino \
SC/OsF fonts from Adobe. Note that it is not my aim to exactly \
reproduce the outlines of the original Adobe fonts. The SC and \
OsF in the FPL Fonts were designed with the glyphs from URW \
Palladio L as starting point. For some glyphs (e.g. 'o') I got \
the best result by scaling and boldening. For others (e.g. 'h') \
shifting selected portions of the character gave more \
satisfying results. All this was done using the free font \
editor FontForge. The kerning data in these fonts comes from \
Walter Schmidt's improved Palatino metrics. LaTeX use is \
enabled by the mathpazo package, which is part of the psnfss \
distribution."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.003svn54512"

RPM_NAME = "texlive-fpl-2026.226.1.003svn54512-60.2.noarch.rpm"
RPM_HASH = "0ca357bd1795df8e94f5dced96b6beb4ad0657b0e564ea70acc28db509f0d161a541a1f1890d18560970ccfe92d45543a5c37b906f13a08a860d5b122fcd5b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fpl-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
