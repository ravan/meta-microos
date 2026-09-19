SUMMARY = "Always room for a new write stream"
DESCRIPTION = "The package aims to solve the error 'No room for a new \\write', \
which occurs when the user, or when the user's packages have \
'allocated too many streams' using \\newwrite (TeX has a fixed \
maximum number - 16 - such streams built-in to its code). The \
package hooks into TeX primitive commands associated with \
writing to files; it should be loaded near the beginning of the \
sequence of loading packages for a document. The package uses \
the l3kernel bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-morewrites-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "74b30626351626ca56f19bf0ae3549fce2364bdd72021fbd2afdaeca153b820a5d3a601e3d78a3666712a253fb78fbb3bdc6405af15737700d182e24278a147a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morewrites.sty \
tex-primargs.sty \
texlive-morewrites"

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
