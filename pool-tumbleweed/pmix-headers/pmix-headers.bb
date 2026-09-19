SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary the headers for PMI-X."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-headers-3.2.5-2.10.noarch.rpm"
RPM_HASH = "03f23fabfb441db5cbbe1f51dbb8c3a57438417ad26588e5d14f16754f4e8ad0a90e5220867f8760ddbee0c81cfe4ad958908cd081a3cd0615ff29e54b77d467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pmix-headers"

RDEPENDS:${PN} += ""

inherit rpm
