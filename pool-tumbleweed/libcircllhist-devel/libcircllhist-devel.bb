SUMMARY = "Development files for libcircllhist"
DESCRIPTION = "Development files for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist-devel-20180917-2.28.aarch64.rpm"
RPM_HASH = "7ea31f8003d5c2233fe524c4058f96d7fd5fe299ce958ef9b8b9b733c66cdb669aabc981226f1b0b620aebd5ea5818a095cb1d54f2f19964467565835b91f723"

RPROVIDES:${PN} += "libcircllhist-devel"

RDEPENDS:${PN} += "libcircllhist0-0-1"

inherit rpm
