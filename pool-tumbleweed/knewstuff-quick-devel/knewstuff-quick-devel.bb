SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "knewstuff-quick-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "096d3104c4d1eb5424646a1e5be588cbb3db283ed1be198449cfb9f2f1b2942b4e82ccffc03d0aa0a225bd4c263173ac70cb905839cccb2a0b31de894e32940f"

RPROVIDES:${PN} += "cmake-KF5NewStuffQuick \
knewstuff-quick-devel"

RDEPENDS:${PN} += "knewstuff-core-devel \
knewstuff-imports"

inherit rpm
