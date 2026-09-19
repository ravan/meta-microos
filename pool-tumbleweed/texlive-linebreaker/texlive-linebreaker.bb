SUMMARY = "Prevent overflow boxes with LuaLaTeX"
DESCRIPTION = "This package tries to prevent overflow lines in paragraphs or \
boxes. It changes LuaTeX's \\linebreak callback and re-typesets \
the paragraph with increased values of \\tolerance and \
\\emergencystretch until the overflow no longer happens. If that \
doesn't help, it chooses the solution with the lowest badness."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-linebreaker-2026.226.0.0.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "3b91614a43614109aff4d7a3dea3d37cc42c953320b208f758689808529898bfc110d293d51a4386dcd35aa7291631b48d7ea6e79f92db0d18cb1a612bbb53a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linebreaker.sty \
texlive-linebreaker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
