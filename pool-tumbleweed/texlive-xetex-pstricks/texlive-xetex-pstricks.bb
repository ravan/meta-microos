SUMMARY = "Running PSTricks under XeTeX"
DESCRIPTION = "The package provides an indirection scheme for XeTeX to use the \
pstricks xdvipdfmx.cfg configuration file, so that XeTeX \
documents will load it in preference to the standard \
pstricks.con configuration file. With this configuration, many \
PSTricks features can be used in XeLaTeX or plain XeTeX \
documents."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17055"

RPM_NAME = "texlive-xetex-pstricks-2026.226.svn17055-59.4.noarch.rpm"
RPM_HASH = "31dc4fe1dbe8d57bfd91528fd1dfeedaa8e380156f9b8228ca0ce706e0bf9ef3c522eade50a5eb5bcb904160764102a52412bcefe939e63d7b7716d233f99b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks"

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
