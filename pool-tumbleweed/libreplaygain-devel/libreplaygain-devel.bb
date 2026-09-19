SUMMARY = "Development files for libreplaygain"
DESCRIPTION = "This package includes development files for libreplaygain."
LICENSE = "LGPL-2.1-or-later"

PV = "r475"

RPM_NAME = "libreplaygain-devel-r475-3.9.aarch64.rpm"
RPM_HASH = "7c9e0b76e5cfa816ca1d5c85d19490e621d6762183701c3e5f6432a6b981500d0404112da46b7b8eb61a94447b3616871e901d3db272f273ce0df79b0033f6f3"

RPROVIDES:${PN} += "libreplaygain-devel"

RDEPENDS:${PN} += "libreplaygain1"

inherit rpm
