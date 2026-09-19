SUMMARY = "Provide Euro values for national currency amounts"
DESCRIPTION = "Converts arbitrary national currency amounts using the Euro as \
base unit, and typesets monetary amounts in almost any desired \
way. Write, e.g., \\ATS{17.6} to get something like '17,60 oS \
(1,28 Euro)' automatically. Conversion rates for the initial \
Euro-zone countries are already built-in. Further rates can be \
added easily. The package uses the fp package to do its sums."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22191"

RPM_NAME = "texlive-euro-2026.226.1.1svn22191-59.2.noarch.rpm"
RPM_HASH = "dd38b939b2a88f4a730d3e4ebf5304b594afb2f696f76b2191ee41ae5a8901a9771ef802c4e570c880fc2096d032cc20ca3f0143ab9ca295d2b5a05e9aabe7d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euro.sty \
texlive-euro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp-basic.sty \
tex-fp-snap.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
