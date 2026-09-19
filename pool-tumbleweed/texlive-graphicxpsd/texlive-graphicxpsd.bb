SUMMARY = "Adobe Photoshop Data format (PSD) support for graphicx package"
DESCRIPTION = "This package provides Adobe Photoshop Data format (PSD) support \
for the graphicx package with the sips (Darwin/macOS) or \
convert (ImageMagick) command."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-2026.226.1.2svn57341-60.4.noarch.rpm"
RPM_HASH = "777cdc0bce788a4714654c1f427f8e9fa3e65398e8e31292a4a8d7650bb10db40e1887b3a6b7827f778f559adfcb580675100cfd6faa03c6e18716e369cdbb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicxpsd.sty \
texlive-graphicxpsd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
