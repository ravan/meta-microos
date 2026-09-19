SUMMARY = "Serbian cyrillic localization"
DESCRIPTION = "This package provides abstract, chapter, title, date etc, for \
serbian language in cyrillic scripts in T2A encoding and cp1251 \
code pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-2026.226.svn23734-60.2.noarch.rpm"
RPM_HASH = "23e2335ad1f71b9d399408f0737caaafc338c22ad92ec482b4ee0f93722f578d2668bdac260b371834ad86381b4fa29708fb4ec318d8586beef983d1bc0ba75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-def-cyr.sty \
texlive-serbian-def-cyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
