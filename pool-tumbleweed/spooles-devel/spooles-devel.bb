SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-devel-2.2-3.8.aarch64.rpm"
RPM_HASH = "4d31a1697e0bae17aa02b763d46764ee3925b527bbdba234a7bc332756e9bb92bf3a0d48761228e543786d3868767f74b6cac22dfc739a184f0b67ef514308fe"

RPROVIDES:${PN} += "spooles-devel"

RDEPENDS:${PN} += "libspooles2-2"

inherit rpm
