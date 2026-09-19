SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against mvapich2."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-mvapich2-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "446bc07fda17aa630dd818dd47f5e2bd060c68e389a8d1dc7b1ac8f7ab7b01024e251e3e81740b606cb118cbba045f4927e3ee05894cacccf89af0b7fb28155c"

RPROVIDES:${PN} += "libblacs2-mvapich2-devel-static"

RDEPENDS:${PN} += "libblacs2-mvapich2-devel"

inherit rpm
