SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "b6f694b93183178f825eda0aec32177aaa6b58cd3cda87aa630496f50680a939325624408a3dd8c050c5c41993972f85271dc19700223fc7130e173b31cf3cfc"

RPROVIDES:${PN} += "cross-ppc64le-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
