SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Oliveleaf-Icons-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "fb7b08cac3f2ded73752e79293eb9db37353816c817a8e6072b4d510fb784baeaf1f75ace4e392ab6bb52e85866a106f7305c0fd3dbbf83aaa83f9a0d574b0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Oliveleaf-Icons"

RDEPENDS:${PN} += ""

inherit rpm
