SUMMARY = "Using a color stack for transparency with pdfTeX"
DESCRIPTION = "pdfTeX and LuaTeX support several color stacks. This package \
shows how a separate color stack can be used for transparency, \
a property besides color that works across page breaks. If the \
PDF management is used it can also be used with other engines, \
but without support for page breaks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-transparent-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "21b492e7a55ad0cbd97b68a23bed54cdd6b46c6c80a4d16f73e3d39f7e65d04f8dab8536661aaa1a2c56f5cf95688140935379ce0371c0d742984a64b7014da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-transparent-nometadata.sty \
tex-transparent.sty \
texlive-transparent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
