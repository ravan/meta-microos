SUMMARY = "Display class/package/file information"
DESCRIPTION = "The package provides a minimalist shell script, for Unix \
systems, that displays the information content in a \
\\ProvidesFile, \\ProvidesPackage or \\ProvidesClass command in a \
LaTeX source file. The package requires that the readprov \
package is available."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn67526"

RPM_NAME = "texlive-typeoutfileinfo-2026.226.0.0.32svn67526-59.2.noarch.rpm"
RPM_HASH = "2ed4aa6941661879129dd5bdb5a2d3412ef823db3b564212b5806a616c57a6b499a37e16f7a7b0e6147c3f8d7e07f96f4b805e91cbb5ba1f209d4c525b8116be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-fileinfo \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-typeoutfileinfo-bin"

inherit rpm
