SUMMARY = "Documentation of gcovr"
DESCRIPTION = "Gcovr provides a utility for managing the use of the GNU gcov utility \
and generating summarized code coverage results. \
 \
This package contains the documentation of gcovr."
LICENSE = "BSD-3-Clause"

PV = "6.0"

RPM_NAME = "gcovr-doc-6.0-1.11.noarch.rpm"
RPM_HASH = "f0ea06d0d39d35b23e94d5205157ca25c4d252ebf0440a2ded05b8a67b74ae7814c345a5ee1f8726c0e3a1ba4f14156990b40b78937f1f1df253e1316557665a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr-doc"

RDEPENDS:${PN} += ""

inherit rpm
