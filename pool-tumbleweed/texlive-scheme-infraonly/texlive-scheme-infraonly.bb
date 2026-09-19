SUMMARY = "Infrastructure-only scheme (no TeX at all)"
DESCRIPTION = "This is the TeX Live scheme for infrastructure only, with no \
TeX engines at all. It is useful for automated testing, where \
the actual programs and packages to be tested are installed \
separately afterwards, with tlmgr install."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54191"

RPM_NAME = "texlive-scheme-infraonly-2026.222.svn54191-68.2.noarch.rpm"
RPM_HASH = "18535e0d5529885e04f562e90b41d9f252c4784e448a55a916266e35b4972202d5aee42b1db77af175f3938f5eabf7d0ae3ec40bddbde500b88dfd7f3e15b948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-infraonly \
texlive-scheme-infraonly"

RDEPENDS:${PN} += "texlive-hyphen-base \
texlive-kpathsea \
texlive-scripts \
texlive-texlive.infra"

inherit rpm
