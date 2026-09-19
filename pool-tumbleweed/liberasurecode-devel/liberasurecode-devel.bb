SUMMARY = "Development files for liberasurecode"
DESCRIPTION = "Development files for the Unified Erasure Coding interface."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "liberasurecode-devel-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "174ff8864096207ab727ce342a87476a4c0dcc9b5784c83f88562de2ac0d634196fe2be439c38a915d0d8b901bb3e1daf504b9f25ce752dec01b1424c62a108f"

RPROVIDES:${PN} += "liberasurecode-devel \
pkgconfig-erasurecode-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liberasurecode1"

inherit rpm
