SUMMARY = "Flag style derivation package"
DESCRIPTION = "The flagderiv package is used to create mathematical \
derivations using the flag/flagpole notation. The package \
features an intuitive command syntax, opening and closing \
multiple flagpoles, different comment styles, customizable \
symbols and label namespaces."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.10svn15878"

RPM_NAME = "texlive-flagderiv-2026.226.0.0.10svn15878-59.2.noarch.rpm"
RPM_HASH = "547937ffca9cdf8f7ddc9956d8bc4f8e09119ecc13179f725f8065338b7518dfd53f629cdbe45d5aacaf4e075c5d64cbe1232467f0805db67d01274d39863b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flagderiv.sty \
texlive-flagderiv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
