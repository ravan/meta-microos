SUMMARY = "Development files for kiten"
DESCRIPTION = "Kiten is a tool to learn Japanese. \
 \
This package contains files for developing applications using kiten."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kiten-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c4a8d7139f16749b9e5a871535f164a3aecefd145c7e82bc0879d0bb5223eeffd799b49bb1c83eb6f0ae7f24f618b6bf7b5d6950e3bc566ed442e450a3fde89b"

RPROVIDES:${PN} += "kiten-devel"

RDEPENDS:${PN} += "kiten"

inherit rpm
