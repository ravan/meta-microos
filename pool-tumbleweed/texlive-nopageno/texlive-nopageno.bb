SUMMARY = "No page numbers in LaTeX documents"
DESCRIPTION = "LaTeX's standard styles use two page styles, one on normal \
pages and one on 'opening' pages with \\maketitle or \\chapter, \
etc. Unfortunately there is only easy access to changing one of \
these two so if you want something other than 'plain' on the \
opening pages you must use \\thispagestyle on each such page. \
The fancyhdr package does provide a more flexible interface, \
but if you just want an empty page style on all pages then this \
package will do the job."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nopageno-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "fc3ea9b8f853f675b6ae918d3d498514bb8ab8f792b0dd77e354f8017f02f004fa5e148f81502058bcc83b4211cbd99377b440beb6842099987d6cf94673c806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nopageno.sty \
texlive-nopageno"

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
