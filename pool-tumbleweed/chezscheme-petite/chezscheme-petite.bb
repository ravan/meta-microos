SUMMARY = "Faster interpret version of ChezScheme"
DESCRIPTION = "Petite Chez Scheme is a complete Scheme system that is fully compatible with Chez Scheme but uses a fast interpreter in place of the compiler."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-2.0-only & Zlib & SUSE-GPL-2.0-with-linking-exception"

PV = "10.3.0"

RPM_NAME = "chezscheme-petite-10.3.0-1.4.aarch64.rpm"
RPM_HASH = "9f3fb27265a7eba28bc55fa52be3a8c4b47ca3280b7e2621ab495f1e930bb3325970020c1beda711cd327e5c7073e1425b08b43fc5ea03871f962281f6c22396"

RPROVIDES:${PN} += "chezscheme-petite"

RDEPENDS:${PN} += ""

inherit rpm
