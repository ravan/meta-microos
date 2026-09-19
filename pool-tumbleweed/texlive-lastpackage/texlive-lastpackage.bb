SUMMARY = "Indicates the last loaded package"
DESCRIPTION = "This package may be used to define the last point where some \
code shall be executed. Its provides a package name for use in \
package-placing commands from the author's templatetools. Usage \
examples are provided in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-2026.226.0.0.1svn34481-63.2.noarch.rpm"
RPM_HASH = "0875356b8a0c441d01392bd5945ce0bcdf575707e6e815cd2010bc63aaf68fcf19cbf81fd1b0b518aecdae14426ae53c003a058440a3c632862d4aef3a566f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lastpackage.sty \
texlive-lastpackage"

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
