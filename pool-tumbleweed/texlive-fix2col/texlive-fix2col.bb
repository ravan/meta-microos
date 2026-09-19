SUMMARY = "Fix miscellaneous two column mode features"
DESCRIPTION = "OBSOLETE: do not use in new documents. This package will do \
nothing in LaTeX formats after 2015/01/01 as the fixes that it \
implements were incorporated into the fixltx2e package, which \
is itself obsolete as since the 2015/01/01 release these fixes \
are in the LaTeX format itself. Fix mark handling so that \
\\firstmark is taken from the first column if that column has \
any marks at all; keep two column floats like figure* in \
sequence with single column floats like figure."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-2026.226.0.0.04svn38770-59.2.noarch.rpm"
RPM_HASH = "26383ef16880eca83a3f4f19538f2809fe7a87c48af649536f50cb66f15125692f2b9562482ed3ab90286d6123810c4e4a4a19bc7b97e1c7deb7363705163f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fix2col.sty \
texlive-fix2col"

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
