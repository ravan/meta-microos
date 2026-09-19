SUMMARY = "Numerical integration using Lua inside LaTeX documents"
DESCRIPTION = "This package uses Lua to calculate the numerical integral value \
of real-valued functions of a real variable over closed and \
bounded intervals. The package provides commands to perform \
numerical integration using the mid-point, trapezoidal, and \
Simpson's one-third and three-eighth rules. The loadstring \
command is used to load and evaluate functions at different \
points in the mathematics environment of Lua. The package also \
provides commands to perform numerical integration using \
step-by-step calculations. The package's commands have an \
optional argument to round off the numbers to the desired \
number of decimal places. The breqn package is loaded to \
display and align step-by-step calculations properly. Advanced \
users can customize the code to achieve the desired formatting \
of step-by-step computations. The package can assist in \
creating various problems on numerical integration with their \
solutions. The results obtained using different methods of \
numerical integration can be compared. It can save users' \
efforts of doing computations involving numerical integration \
in external software and copying them inside LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn68918"

RPM_NAME = "texlive-luanumint-2026.226.1.2svn68918-59.2.noarch.rpm"
RPM_HASH = "8290c9c464dfb1c586c9e5a42f3d2506e8cf5cf01eeacebaa56962fb30b98a7503ff80dec407eef1f7ce651c04d3b7d79120f4cb4480b855d30768d70d7d2bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luanumint.sty \
texlive-luanumint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-breqn.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
