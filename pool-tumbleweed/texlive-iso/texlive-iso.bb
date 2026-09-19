SUMMARY = "Generic ISO standards typesetting macros"
DESCRIPTION = "Generic class and package files for typesetting ISO \
International Standard documents. Several standard documents \
have been printed by ISO from camera-ready copy prepared using \
LaTeX and these files. The class makes use of the isorot \
package, rather than use other mechanisms directly."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn15878"

RPM_NAME = "texlive-iso-2026.226.2.4svn15878-63.2.noarch.rpm"
RPM_HASH = "643c18e18d4260eb6fc5a17989a3f0d5e99658f3872edffa4f0dd090665804e53d70b92e9ada966a4f9e27f21e19c80e83c990c6effbeb102f343454bb38c6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askincv1.sty \
tex-iso10.clo \
tex-iso11.clo \
tex-iso9.clo \
tex-isov2.cls \
texlive-iso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
