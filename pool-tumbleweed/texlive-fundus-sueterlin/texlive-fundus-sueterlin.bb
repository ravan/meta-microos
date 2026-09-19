SUMMARY = "Sutterlin"
DESCRIPTION = "The package supports use, in LaTeX, of the Metafont emulation \
of the Sueterlin handwriting fonts The package is distributed \
as part of the fundus bundle.."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-2026.226.1.2svn26030-60.2.noarch.rpm"
RPM_HASH = "907b1bf98023a74e6358a1825cd88a175622f6715f3768bb0c71c297e30313bb51e01e9bb5bed7043b7218d85f0bb6ba93a47e1effd7b622882c91f6f1eaa9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suetterl.sty \
texlive-fundus-sueterlin"

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
