SUMMARY = "Extend LaTeX's cross-reference system"
DESCRIPTION = "This package extends the cross-reference system of LaTeX2e and \
introduces concepts of namespace and scope. It also allows \
users to customize reference formats. The package is part of \
the WT Series. Prerequisite packages: xparse and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn69214"

RPM_NAME = "texlive-wtref-2026.226.1.0.0svn69214-59.4.noarch.rpm"
RPM_HASH = "c46803b3d30af3c6c23f3a7c61c0886864e887667c0d366ceac55ccfebc019ac7a0648a3ca47a83bb72213a42360b762bda81ea2f08c492efd713e3cc900833c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wtref.sty \
texlive-wtref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
