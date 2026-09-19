SUMMARY = "LICR macros and encoding definition files for Greek"
DESCRIPTION = "LICR macros for characters from the Greek script and encoding \
definition files for Greek text font encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-greek-fontenc-2026.226.2.6svn77682-60.4.noarch.rpm"
RPM_HASH = "4f4800a9376d4d37a548ed18c9976c2512fc1c9e07018a7fba0f4fe66578d1fe6f5e40962cdf32e99eb58cd0f15d00d3a690a60f44456616dee650dd6d0e2adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphabeta.sty \
tex-greek-euenc.def \
tex-greek-fontenc.def \
tex-lgrenc.def \
tex-puenc-greek.def \
tex-textalpha.sty \
tex-tuenc-greek.def \
texlive-greek-fontenc"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
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
