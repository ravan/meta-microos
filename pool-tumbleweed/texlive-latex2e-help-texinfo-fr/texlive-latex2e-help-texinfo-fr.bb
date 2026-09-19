SUMMARY = "A French translation of 'latex2e-help-texinfo'"
DESCRIPTION = "This package provides a complete French translation of \
latex2e-help-texinfo."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn64228"

RPM_NAME = "texlive-latex2e-help-texinfo-fr-2026.226.svn64228-61.2.noarch.rpm"
RPM_HASH = "74f7e971830671f9012607acfea052d631cc3d4404413ec476e68e2f3861268f75ba10e4ad619a63ca173d8f51123e8a177926bdb47ba4902b4edac9b3a3a3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-fr"

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
