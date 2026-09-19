SUMMARY = "A lightweight and robust key-value parser"
DESCRIPTION = "The package provides lightweight and robust facilities for \
creating and managing keys. Its machinery isn't as extensive as \
that of, e.g., the ltxkeys package, but it is equally robust; \
ease of use and speed of processing are the design aims of the \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-2026.226.0.0.0.2svn23698-63.2.noarch.rpm"
RPM_HASH = "91289f088621586edd416948d91e544ac6ac8e7616a4ab855cc3496bd141c85419745b45de5b6174f8aad8e6ac9d3a4ea9656a86bd7882621f7fbc004cf2cdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyval2e.sty \
texlive-keyval2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
