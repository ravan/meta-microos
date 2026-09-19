SUMMARY = "Documentation for Kvantum engine"
DESCRIPTION = "This package provides instructions on how to change configuration or make new themes for Kvantum engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-doc-1.1.8-1.2.noarch.rpm"
RPM_HASH = "daf601570bb5f8bfdc8c949950b9a1f35010959e656bf4abb1347fbf14b303321ff6c53c8648f7c269e999663e1b691cc7d1b8746f9e385142023cbcaaacd4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-doc"

RDEPENDS:${PN} += ""

inherit rpm
