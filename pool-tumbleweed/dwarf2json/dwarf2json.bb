SUMMARY = "Generate ELF/DWARF symbol and type information for volatility3"
DESCRIPTION = "dwarf2json is a Go utility that processes files containing symbol and type \
information to generate Volatilty3 Intermediate Symbol File (ISF) JSON output \
suitable for Linux and macOS analysis."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.6.0~git.20200714T092604.d1b08fe"

RPM_NAME = "dwarf2json-0.6.0~git.20200714T092604.d1b08fe-1.29.aarch64.rpm"
RPM_HASH = "8fda538fd9500eed8a2abe6693ad227eb373875d2834e46b73d27b060d57573ea1f02e6960053c9456ae454ed91c1d3cd3f6d3f0cdcf6f9a1e3b2bce9a9d65e1"

RPROVIDES:${PN} += "dwarf2json"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
