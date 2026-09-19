SUMMARY = "Examples for Hypre"
DESCRIPTION = "This package contains examples for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mvapich2-examples-3.1.0-1.2.noarch.rpm"
RPM_HASH = "6b36c73b48f4a70bee50609ceaa7b483fdd9bac95cf4847506c1550a31bfb127c96fed57f437f14aac0d71d129012b0376adc03dbabd4278b18f2bd8f389cf5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-mvapich2-examples"

RDEPENDS:${PN} += ""

inherit rpm
