SUMMARY = "Print version information for a LaTeX file"
DESCRIPTION = "ltxfileinfo displays version information for LaTeX files. If no \
path information is given, the file is searched using \
kpsewhich. As an extra, for developers, the script will (use \
the --star or --color options) check the valididity of the \
\\Provides... statements in the files. The script uses code from \
Uwe Luck's readprov.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.04svn38663"

RPM_NAME = "texlive-ltxfileinfo-2026.226.2.04svn38663-59.2.noarch.rpm"
RPM_HASH = "c59650c7a8018729f2a19f210d8a516eb2bbe03f420b0a7d1e8994f58c2815816672ed941299b34abdf365ea69ef4d32ce9732ade99af7b46fb1d2fb9d458502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxfileinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ltxfileinfo-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
