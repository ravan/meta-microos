SUMMARY = "Advanced formatting of cross references"
DESCRIPTION = "The package provides a consistent way of producing references \
throughout a project. Enough flexibility is provided to make \
local changes to a single reference. The user can configure \
their own setup. The package offers a direct interface to \
varioref (for use, for example, in large projects such as a \
series of books, or a multivolume thesis written as a series of \
documents), and name references from the nameref package may be \
incorporated with ease. For large projects such as a series of \
books or a multi volume thesis, written as freestanding \
documents, a facility is provided to interface to the xr \
package for external document references."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn77682"

RPM_NAME = "texlive-refstyle-2026.226.0.0.6bsvn77682-60.4.noarch.rpm"
RPM_HASH = "6b592580bba452a06a501375457e147fef683c510c3f7020764fdd80efe55fed7b9b80b14948836744e4fd7bb39979eba4c381d46aca1251bb4765ff55d9890f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refstyle.cfg \
tex-refstyle.sty \
texlive-refstyle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
