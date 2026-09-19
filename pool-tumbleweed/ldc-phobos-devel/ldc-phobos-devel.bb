SUMMARY = "Development files for the D standard library"
DESCRIPTION = "This package contains the Phobos development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "ldc-phobos-devel-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "dbead76a10bfc9c8ff3b5da5783a2d242e3ee8be5ea2e5c473c0ba554c132e5cadd0bae29e5442ebcd5dd0870073558460a209dfe4b70a3bb1f40da68fdbd597"

RPROVIDES:${PN} += "ldc-phobos-devel"

RDEPENDS:${PN} += "ldc-runtime-devel \
libphobos2-ldc112"

inherit rpm
