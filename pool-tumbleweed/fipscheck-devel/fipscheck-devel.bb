SUMMARY = "Development files for fipscheck"
DESCRIPTION = "This package contains development files for fipscheck."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-devel-1.7.0-2.12.aarch64.rpm"
RPM_HASH = "c9e825cde81212276d725e558515d4f32236fb008fe2581fdfe8a739791a10d091cbf76b78e1b59ead3bdf02caa846920ed593fda774c1b6ec3540626eb4d0bd"

RPROVIDES:${PN} += "fipscheck-devel"

RDEPENDS:${PN} += "libfipscheck1"

inherit rpm
