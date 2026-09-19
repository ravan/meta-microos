SUMMARY = "Documentation for kid3-qt"
DESCRIPTION = "This package provides documentation and help files for kid3-qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-qt-doc-3.9.7-2.6.aarch64.rpm"
RPM_HASH = "b0ef54356a8ae43d885ab63be9f3963b69378bd505e3bbbf5f60f771e9ec3325fb0c261864deef9860316efc8f2a5a968dcf5680e58802a5588661f4c5bb0c48"

RPROVIDES:${PN} += "kid3-qt-doc"

RDEPENDS:${PN} += "kid3-qt"

inherit rpm
