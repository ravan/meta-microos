SUMMARY = "Documentation for the library of Optimized Inner Loops"
DESCRIPTION = "This package provides documentation for liboil, a library of \
functions that are optimized for various CPUs."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-doc-0.3.17-26.18.noarch.rpm"
RPM_HASH = "24fe20a54de46cc2bcfa5bbbbec9ea85e22430308dc2516569650901a39aa3cc7272188b27670afdbbf9cec4fe5c4c9a1ac6ff3f9646d407a2cfded4c70e8524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboil-doc"

RDEPENDS:${PN} += ""

inherit rpm
