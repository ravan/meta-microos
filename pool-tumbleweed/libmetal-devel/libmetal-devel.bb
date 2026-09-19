SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "2025.04.0"

RPM_NAME = "libmetal-devel-2025.04.0-1.5.aarch64.rpm"
RPM_HASH = "6b40c7a08238955c5fd009ec7cbb62fa67aed946568480774dd06614518a7bec14d5c11f0082462d1b1e479a228e84c13e0a6f32acee9570035df65f1a596b4e"

RPROVIDES:${PN} += "libmetal-devel"

RDEPENDS:${PN} += "libmetal1"

inherit rpm
