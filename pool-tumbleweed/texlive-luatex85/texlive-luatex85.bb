SUMMARY = "PdfTeX aliases for LuaTeX"
DESCRIPTION = "The package provides emulation of pdfTeX primitives for LuaTeX \
v0.85+."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-luatex85-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "6230b5a894d3b726c04b89bc6202d5680baff1acd61e3f7479cd90f0a39190059d788f72c47cb389373bb385265ef551368aec35ee228f066863c4fdce8bbfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatex85.sty \
texlive-luatex85"

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
