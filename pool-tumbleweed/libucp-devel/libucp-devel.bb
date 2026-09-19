SUMMARY = "Development files for Unified Communication Protocols (UC-P)"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucp-devel-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "e4a0ddbe783ea030f97c3dc54f6d167425b60bcd6d206ac711ce9b8cedccaf8d10e52e383bfaa69d07f8679290c1f1d6e0a37c89cc6a085d1543a2a202bcf2f2"

RPROVIDES:${PN} += "libucp-devel"

RDEPENDS:${PN} += "libucp0"

inherit rpm
