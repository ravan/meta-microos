SUMMARY = "Documentation files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the documentation for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-doc-1.2.2-1.17.noarch.rpm"
RPM_HASH = "10900690214a5e63e57c2888a0a5a078d49cf2fa948d9c1b5e6c0124210be13b8ff3317269854f63fd1e23f8675a271926af13c4c045803f9f6105eef01145e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqrtr-glib-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
