SUMMARY = "User level management of LaTeX input and output"
DESCRIPTION = "Commands are defined to manage the limited pool of input and \
output handles provided by TeX. The streams so provided are \
mapped to various of the LaTeX input and output mechanisms. \
Some facilities of the verbatim package are also mapped."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn15878"

RPM_NAME = "texlive-newfile-2026.226.1.0csvn15878-61.2.noarch.rpm"
RPM_HASH = "fa3a2b68d124ee7ca5c9ce91ba817cdaf373e10db2c13a86435a44390d7f4243c6858739cfc695169fe36efadeb38d02e4f63ad7fa7482b1aa68c20c759de2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newfile.sty \
texlive-newfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
