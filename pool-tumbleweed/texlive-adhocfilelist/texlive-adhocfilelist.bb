SUMMARY = "'\\listfiles' entries from the command line"
DESCRIPTION = "The package provides a Unix shell script to display a list of \
LaTeX \\Provides...-command contexts on screen. Provision is \
made for controlling the searches that the package does. The \
package was developed on a Unix-like system, using (among other \
things) the gnu variant of the find command."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-adhocfilelist-2026.226.svn29349-61.2.noarch.rpm"
RPM_HASH = "90d0fa004e5c27efb5cadf7e4dd6f82c2be9271ebf75ff04ddba3349a9c66da1f3deed65d447d3106a28e83ca8f5ffb160d5b7f4c65873a59062cf9cc92c43ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adhocfilelist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-adhocfilelist-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
