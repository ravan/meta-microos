SUMMARY = "Header files for xdelta3"
DESCRIPTION = "Header files for xdelta3."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "xdelta3-devel-3.1.0-6.5.aarch64.rpm"
RPM_HASH = "0d404603779e54bd3ad61e71a4c9d5200a7d005563efdfa13f690f79990f3d3ed8e326351b2eea097e7dc3b97c762b76614d63135f3ca9f88fa8f80c8c43d47a"

RPROVIDES:${PN} += "xdelta3-devel"

RDEPENDS:${PN} += ""

inherit rpm
