SUMMARY = "Prints the version and date of a LaTeX class or style file"
DESCRIPTION = "This simple shell script prints the version and date of a LaTeX \
class or style file. Syntax: latexfileversion <file> This \
programme handles style files (extension .sty), class files \
(extension .cls), and other TeX input files. The file extension \
must be given."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-2026.226.0.0.3svn29349-61.2.noarch.rpm"
RPM_HASH = "77172bb8aed1f69142c279c9b6263b72243687ec706d612cb026e9d9c9adf6515b225fadf3a977ea983482aea34ad0ed2c8b74426a4a226cf1ad4f985adb36ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion"

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
texlive-latexfileversion-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
