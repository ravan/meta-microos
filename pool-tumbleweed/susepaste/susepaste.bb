SUMMARY = "Script for using openSUSE paste"
DESCRIPTION = "A script for using the openSUSE paste service. \
You can paste either the file or input from stdin."
LICENSE = "GPL-3.0-only"

PV = "20241225"

RPM_NAME = "susepaste-20241225-1.6.noarch.rpm"
RPM_HASH = "edfc0cb3a492077e73e4ad414ec1ca60bfa72a4dfe5ad506b44f87b7c3f445a40dd3d55b726a8cfceb373cb35f0140d92b0176b259335261fa6f006cffaf162e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susepaste"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
curl"

inherit rpm
