SUMMARY = "Convert numbers to letters"
DESCRIPTION = "Provides commands \\alphalph and \\AlphAlph. They are like \
\\number but the expansion consists of lowercase and uppercase \
letters respectively (1 to a, 26 to z, 27 to aa, 52 to zz, 53 \
to ba, 702 to zz, 703 to aaa, etc.). Can be used as a \
replacement for LaTeX's \\@alph and \\@Alph macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-alphalph-2026.226.2.6svn77682-61.2.noarch.rpm"
RPM_HASH = "cd350e3464fd8d5212a543b58103c246db90d5242be753d66d8059a9c041bc3dc7aeb0777f1c337988b6cd8b92ce6681616d607bef03224a32dec9fcd42189db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphalph.sty \
texlive-alphalph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-intcalc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
