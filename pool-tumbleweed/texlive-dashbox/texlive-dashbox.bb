SUMMARY = "Draw dashed boxes"
DESCRIPTION = "The package can draw boxes that perform like \\framebox or \
\\fbox, but use dashed lines. The package can also draw (an \
illusion of) vertical stacks of boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14svn77682"

RPM_NAME = "texlive-dashbox-2026.226.1.14svn77682-61.2.noarch.rpm"
RPM_HASH = "22898c8b78f63e8c0b3338585489548457ab695cdf0112b6afa9076f2cb418da8f02362f469016edc1d813eb2c84d1a22d43a9e7a75dd696d72eb10883f4cd5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashbox.sty \
texlive-dashbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
