SUMMARY = "Examples for QElectroTech"
DESCRIPTION = "This packages contains examples for the QElectroTech application."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.100"

RPM_NAME = "qelectrotech-examples-0.100-1.3.noarch.rpm"
RPM_HASH = "62ce4faa089b9edf8e0c29a3a2ff1fe43363ab09ec408d5ee805394f73ff619603c20e578059bef89448fefa56814e10547471cf9d50b8386935d2ba5001b2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qelectrotech-examples"

RDEPENDS:${PN} += "qelectrotech"

inherit rpm
