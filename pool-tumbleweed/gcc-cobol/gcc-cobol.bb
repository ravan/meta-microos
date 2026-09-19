SUMMARY = "The system GNU Cobol Compiler"
DESCRIPTION = "The system GNU Cobol Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-cobol-16-1.1.aarch64.rpm"
RPM_HASH = "3745b909f0d165d3313535e4cdabd58c953ae5788542e9a0410bba7c4062512ef62da9935cb23332b25fc303d3459fc463d69b70000023b3f96c50bb2e40e8aa"

RPROVIDES:${PN} += "gcc-cobol"

RDEPENDS:${PN} += "gcc \
gcc16-cobol"

inherit rpm
