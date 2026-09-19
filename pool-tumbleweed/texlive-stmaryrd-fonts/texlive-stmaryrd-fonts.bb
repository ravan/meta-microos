SUMMARY = "Severed fonts for texlive-stmaryrd"
DESCRIPTION = "The  separated fonts package for texlive-stmaryrd"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-stmaryrd-fonts-2026.226.svn77682-64.2.noarch.rpm"
RPM_HASH = "ac11e4438c84c08a4fa89cf88090251ebdeca74d06a98ea0636baa550384f58eee04c037eb5eb32d12f1b2e026dac065dcdaf7367993c05be4bea149017ffc60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-stmary10 \
font-stmary5 \
font-stmary6 \
font-stmary7 \
font-stmary8 \
font-stmary9 \
texlive-stmaryrd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
