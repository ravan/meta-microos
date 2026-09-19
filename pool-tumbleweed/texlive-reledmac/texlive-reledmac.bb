SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac and eledmac packages. Ledmac \
itself was a LaTeX port of the plain TeX EDMAC macros. The \
package supports indexing by page and by line numbers, and \
simple tabular- and array-style environments. The package is \
distributed with the related reledpar package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.44.3svn78101"

RPM_NAME = "texlive-reledmac-2026.226.2.44.3svn78101-60.4.noarch.rpm"
RPM_HASH = "13ccba8f6e387ece00b75906811f5cebef1c4bd146b21d7bf97ff5a5a53ed26a33ac83d97afc45346ac609e7ef4dcda38ccd4a112a4394994616fe231f59c1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reledmac.sty \
tex-reledpar.sty \
texlive-reledmac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-ragged2e.sty \
tex-suffix.sty \
tex-xargs.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
