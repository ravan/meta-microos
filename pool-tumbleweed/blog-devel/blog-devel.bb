SUMMARY = "Provides library and header for boot logging"
DESCRIPTION = "The libaray and the header file for the FIFO interface used to build \
the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.48"

RPM_NAME = "blog-devel-2.48-1.1.aarch64.rpm"
RPM_HASH = "c05192a9d2ab25ee53219185c015a4b37a77db7a187b9e68f997e66867296547d7b222aab06291f77a1e3614ceb49a0608cbe4841e60cd34f64b24f15e870a56"

RPROVIDES:${PN} += "blog-devel"

RDEPENDS:${PN} += "libblogger2"

inherit rpm
