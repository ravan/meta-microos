SUMMARY = "The system GNU C Compiler"
DESCRIPTION = "The system GNU C Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-16-1.1.aarch64.rpm"
RPM_HASH = "0d85869a72dd1932f282f4f076084e530a0264f1e88fde933fc5b9202e97b6f4315144a7b10bd1017bc2873cd423dea1b9839da2391b0131b0b9e643f9e32c2b"

RPROVIDES:${PN} += "c-compiler \
gcc"

RDEPENDS:${PN} += "cpp \
gcc16"

inherit rpm
