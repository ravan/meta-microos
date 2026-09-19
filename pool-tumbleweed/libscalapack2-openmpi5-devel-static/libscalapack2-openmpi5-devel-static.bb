SUMMARY = "Static libraries for ScaLAPACK (openmpi5)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi5."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-openmpi5-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "3c91ff6f3ac4535210d54585ad358a0f46e41dbe5c7ca1fca2509b5b83acb3564274d0ed91ea7b52a2de16184e2adcfe0aae3954a5392cd044c7a87d46ec9e24"

RPROVIDES:${PN} += "libscalapack2-openmpi5-devel-static \
scalapack-openmpi5-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi5-devel"

inherit rpm
