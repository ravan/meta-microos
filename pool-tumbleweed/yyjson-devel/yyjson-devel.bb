SUMMARY = "Headers for yyjson"
DESCRIPTION = "A JSON library compliant with the RFC 8259 JSON standard. \
This subpackage provides the headers for building with yyjson."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "yyjson-devel-0.12.0-1.5.aarch64.rpm"
RPM_HASH = "e303629ef59a0c8ff4acb0f53683923b416a6876097d634d0ea9009c9b97c542d636e2bf887cdaa8f6d529a05d4bd5b2508270aca7fefc992340c872a143e902"

RPROVIDES:${PN} += "cmake-yyjson \
pkgconfig-yyjson \
yyjson-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyyjson0"

inherit rpm
