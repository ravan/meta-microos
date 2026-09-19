SUMMARY = "A simple package to set up document margins"
DESCRIPTION = "This package is considered obsolete; alternatives are the \
typearea package from the koma-script bundle, or the geometry \
package."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-anysize-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ebb6e23fdf52c72b0c670307096fe491fcd61f42f8210b1ddcf564cc0bd959ae17d2cb59f41a3533d231280273c93a847c289075863191bf0cc3d2597019904f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anysize.sty \
texlive-anysize"

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
