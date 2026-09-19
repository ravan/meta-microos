SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "A free Java homebanking application that uses the HBCI4Java implementation \
and runs as a plugin inside the Jameica framework. Support chipcards \
key files and PIN/TAN including chipTAN and smsTAN for authentification. \
Supported file formats include MT940, DTAUS, CSV, Moneyplex and PDF/HTML."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.12.0"

RPM_NAME = "hibiscus-2.12.0-1.5.aarch64.rpm"
RPM_HASH = "8ec47aa79316c28dda1ea3e10c811c308db7cd1c41233c99f607da90c8bb460c3ca1588de5f9e0f5cb86af3eee1b735c8ef95cb49820335cca0b876a7d81ca4c"

RPROVIDES:${PN} += "hibiscus"

RDEPENDS:${PN} += "/sbin/ldconfig \
jameica"

inherit rpm
