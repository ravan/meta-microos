SUMMARY = "Coturn development headers"
DESCRIPTION = "This package contains the TURN development headers."
LICENSE = "BSD-3-Clause"

PV = "4.18.0"

RPM_NAME = "coturn-devel-4.18.0-1.1.aarch64.rpm"
RPM_HASH = "cf72732c098025da5c94722e5741600fa0e5b7f9d57c60e0df131095ba6fc7d509389f8255dee75d09d2b633f6e93d8202225044477984a7f62fff92101d7982"

RPROVIDES:${PN} += "coturn-devel"

RDEPENDS:${PN} += "coturn"

inherit rpm
