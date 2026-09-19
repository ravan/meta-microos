SUMMARY = "The system GNU Algol 68 Compiler"
DESCRIPTION = "The system GNU Algol 68 Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-algol68-16-1.1.aarch64.rpm"
RPM_HASH = "4fa15e3f7a8c09c77200ce5d48fd18807372921282a9bb512c786bb1225156a6743b151365c93d07fc8d2b3adb2b28732033fa14d930edfc7277cc0a5db2f31e"

RPROVIDES:${PN} += "gcc-algol68"

RDEPENDS:${PN} += "gcc \
gcc16-algol68"

inherit rpm
