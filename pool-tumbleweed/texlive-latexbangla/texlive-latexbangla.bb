SUMMARY = "Enhanced LaTeX integration for Bangla"
DESCRIPTION = "This package simplifies the process of writing Bangla in LaTeX \
and addresses most of the associated typesetting issues. \
Notable features: Automated transition from Bangla to English \
and vice versa. Patch for the unproportionate whitespace issue \
in popular Bangla fonts. Full support for all the common \
commands and environments. Bangla numbering for page, section, \
chapter, footnotes etc. (extending polyglossia's support). New \
theorem, problems, example, solution and other environments, \
all of which are in Bangla."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-2026.226.0.0.2svn55475-61.2.noarch.rpm"
RPM_HASH = "cff9a18bdcdf4040de5362dc24cf8407b5a18aeb27df11eb673ee4595743d67d53308ec40dba12d4704a0e29f3c2d965dbb3ae02d53e1e66e60884aff1cb4c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexbangla.sty \
texlive-latexbangla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-chngcntr.sty \
tex-enumerate.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-polyglossia.sty \
tex-titlesec.sty \
tex-ucharclasses.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
