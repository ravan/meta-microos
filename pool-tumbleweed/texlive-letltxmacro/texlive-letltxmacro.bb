SUMMARY = "Let assignment for LaTeX macros"
DESCRIPTION = "TeX's \\let assignment does not work for LaTeX macros with \
optional arguments or for macros that are defined as robust \
macros by \\DeclareRobustCommand. This package defines \
\\LetLtxMacro that also takes care of the involved internal \
macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-letltxmacro-2026.226.1.6svn77682-61.2.noarch.rpm"
RPM_HASH = "8e767f5d8c977719020efb2e46b09f355b8243fbc8af4fc5df5083069e4b555089ff47af6c490e2291db2329e667ad09da6711f5aca796469c0030dc49ab5608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letltxmacro.sty \
texlive-letltxmacro"

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
