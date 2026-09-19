SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kpkpass-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f63aeb1475693462deb8f6f0f922185a73d3f19d59771c4df55de27654b258426964e528e6752de3bd47e2a0a00b8c5c7e502cae3365c943281b8951191fbc5c"

RPROVIDES:${PN} += "kpkpass"

RDEPENDS:${PN} += ""

inherit rpm
