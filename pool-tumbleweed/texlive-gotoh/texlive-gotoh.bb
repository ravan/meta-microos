SUMMARY = "An implementation of the Gotoh sequence alignment algorithm"
DESCRIPTION = "This package calculates biological sequence alignment with the \
Gotoh algorithm. The package also provides an interface to \
control various settings including algorithm parameters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44764"

RPM_NAME = "texlive-gotoh-2026.226.1.1svn44764-60.4.noarch.rpm"
RPM_HASH = "f9745024e973d20efae279c2dd1d5a774df4626917265446ddd9c21b8038801d9133e69794eb33f2cf53294997a82afecf7ce589fdf4bcb7b2d67128b8558365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gotoh.sty \
texlive-gotoh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
