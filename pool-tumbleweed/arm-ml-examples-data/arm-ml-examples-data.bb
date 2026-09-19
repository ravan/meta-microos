SUMMARY = "Data files for arm-ml-examples"
DESCRIPTION = "Data used by machine learning tutorials and examples from Arm's ML developer space."
LICENSE = "Apache-2.0"

PV = "0.0~git20200114.7f6276c"

RPM_NAME = "arm-ml-examples-data-0.0~git20200114.7f6276c-1.10.noarch.rpm"
RPM_HASH = "eb2ac3d5362bfa901796724772c9198e4b1351b8714fdb4a485062aafc60537e42fca83c9ad044a8000dc2ced8e2665dc9669f1121aa1c3b4d38cd3362f7afce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-ml-examples-data"

RDEPENDS:${PN} += ""

inherit rpm
