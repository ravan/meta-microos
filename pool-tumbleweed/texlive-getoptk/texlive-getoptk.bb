SUMMARY = "Define macros with sophisticated options"
DESCRIPTION = "The package provides a means of defining macros whose options \
are taken from a dictionary, which includes options which \
themselves have arguments. The package was designed for use \
with Plain TeX; its syntax derives from that of the \\hbox, \
\\hrule, etc., TeX primitives."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn23567"

RPM_NAME = "texlive-getoptk-2026.226.1.0svn23567-60.2.noarch.rpm"
RPM_HASH = "0aac9f308787c910b46d0aee35dce9031152eadc364b893b9b84e10d1761f786f34bec0c78a76c8b3385c282fa680665632785d715cd826a97e7049e2c940a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getoptk.tex \
tex-guide.tex \
texlive-getoptk"

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
