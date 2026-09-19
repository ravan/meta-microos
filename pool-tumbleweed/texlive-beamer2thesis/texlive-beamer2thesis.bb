SUMMARY = "Thesis presentations using beamer"
DESCRIPTION = "The package specifies a beamer theme for presenting a thesis."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn72949"

RPM_NAME = "texlive-beamer2thesis-2026.226.2.2svn72949-61.2.noarch.rpm"
RPM_HASH = "da9651bec375e64bdb5db56ea6b701d3b5111de1276e8a93ae3c1783adca39139a643a4e26b435774ff3d1f3c2cff33daee740489711774a45e4d4bc54084e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemetorinoth.sty \
tex-beamerfontthemetorinoth.sty \
tex-beamerinnerthemetorinoth.sty \
tex-beamerouterthemetorinoth.sty \
tex-beamerthemeTorinoTh.sty \
texlive-beamer2thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-metalogo.sty \
tex-pifont.sty \
tex-polyglossia.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
