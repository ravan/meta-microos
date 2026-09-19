SUMMARY = "Russian language module for Babel"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Russian (in both 'traditional' and modern forms). \
The support is adapted for use both under 'traditional' TeX \
engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-2026.226.1.3msvn57376-60.2.noarch.rpm"
RPM_HASH = "c4e165393fb2529204b0fa51c517e75e784bd6f533df997f29a359d325e15225b6ad60e0e8b67d2580ec038c8a1ba03183dadf77bfce78c91bae50328e347841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-russianb.ldf \
texlive-babel-russian"

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
