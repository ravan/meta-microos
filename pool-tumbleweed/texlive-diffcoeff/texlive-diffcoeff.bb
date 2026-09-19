SUMMARY = "Write differential coefficients easily and consistently"
DESCRIPTION = "This package allows the easy and consistent writing of \
ordinary, partial and other derivatives of arbitrary (algebraic \
or numeric) order. For mixed partial derivatives, the total \
order of differentiation is calculated by the package. Optional \
arguments allow specification of points of evaluation (ordinary \
derivatives), or variables held constant (partial derivatives), \
and the placement of the differentiand (numerator or appended). \
The package is built on xtemplate and the configurability it \
enables, extending to differentials (including simple line \
elements) and jacobians."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.6svn77682"

RPM_NAME = "texlive-diffcoeff-2026.226.5.6svn77682-59.2.noarch.rpm"
RPM_HASH = "54141fff1afe392a8e6b6edd9abc4fffdf59513ab9639f49de7d1aedbfa305aab60b7eacd526ff697f37d839f60b4c365405c4dd45a6ad6316fb063492d40619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diffcoeff-doc.def \
tex-diffcoeff.sty \
tex-diffcoeff4.sty \
tex-diffcoeff5.def \
texlive-diffcoeff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-mleftright.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
