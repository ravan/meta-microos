SUMMARY = "Scan files for digital TV applications v3"
DESCRIPTION = "Scan data needed for some scanning applications from dvb package and maybe \
others. This package contains v3 of the files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "20240503"

RPM_NAME = "dtv-scan-tables-20240503-1.7.noarch.rpm"
RPM_HASH = "c440424c8e918558939905bbddb6ce5872cccabc9f34d2a1cdbd25dae8ef00f14500cccd44baa09cce27d548edbac5329d85f822c8ff309e2c59645867b3a7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtv-scan-tables"

RDEPENDS:${PN} += ""

inherit rpm
