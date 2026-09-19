SUMMARY = "Examples and more from Guide to LaTeX, by Kopka and Daly"
DESCRIPTION = "The guide-to-latex package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45712"

RPM_NAME = "texlive-guide-to-latex-2026.226.svn45712-60.4.noarch.rpm"
RPM_HASH = "f83cdb134fe66df8744b045c5a19b6bfabb039ca2c62509fc52cd8aec91ed57c107a77128dc692e510cc34eb4f8b80e04558be5ca96119bd269e992bfc35e8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guide-to-latex"

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
