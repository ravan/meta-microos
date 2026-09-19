SUMMARY = "Development files for duktape"
DESCRIPTION = "Embeddable Javascript engine. \
 \
This package contains header files and libraries needed to develop \
application that use duktape."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "duktape-devel-2.7.0-3.11.aarch64.rpm"
RPM_HASH = "39fde04b1a235296ac657ec423b2e67ad11a6fe62311191b38081b348fd2702e076d8717d3097d430512803e8f5a67f946c1b4f74e80b6d12b0f730e21b17a8f"

RPROVIDES:${PN} += "duktape-devel \
pkgconfig-duktape"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libduktape207"

inherit rpm
