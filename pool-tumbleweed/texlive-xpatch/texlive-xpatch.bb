SUMMARY = "Extending etoolbox patching commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
Philipp Lehmann's etoolbox."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-xpatch-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "e6c6a828b231247a8eec43872bf48dc0508a606f7e18d4b484c17f1a27f62a216531e437e631716f5bf36e3daa2ca0604c4bc6840ac6696ac0697a26e923ec5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpatch.sty \
texlive-xpatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
