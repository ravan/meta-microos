SUMMARY = "Simple macros for EPS inclusion"
DESCRIPTION = "The original (and now obsolescent) graphics inclusion macros \
for use with dvips, still widely used by Plain TeX users (in \
particular). For LaTeX users, the package is nowadays (rather \
strongly) deprecated in favour of the more sophisticated \
standard LaTeX latex-graphics bundle of packages. (The \
latex-graphics bundle is also available to Plain TeX users, via \
its Plain TeX version.)"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.7.4svn77682"

RPM_NAME = "texlive-epsf-2026.226.2.7.4svn77682-61.4.noarch.rpm"
RPM_HASH = "bc86d8ccecfad23bb6cb7a5b21b9989d4e9d0cdf57d48d0d455d4291515cf9654995df55c1dacf1b43c6660c4b70ae49170c1000d6dfb3bbe24fdf6629480f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf.sty \
tex-epsf.tex \
texlive-epsf"

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
