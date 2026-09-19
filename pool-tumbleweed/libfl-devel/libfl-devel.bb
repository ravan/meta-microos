SUMMARY = "Development files for flex"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text. \
 \
This package contains files required to build programs with flex libraries."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "libfl-devel-2.6.4-7.10.aarch64.rpm"
RPM_HASH = "c3069ed446f8940fb23462ee6ec60bbe719f630058da79cb7467bd10bb74a1ea45552589e49f3a12bf0d3da33fe4a70013bb829cf11181a7b11b80bf67694229"

RPROVIDES:${PN} += "libfl-devel"

RDEPENDS:${PN} += "libfl2"

inherit rpm
