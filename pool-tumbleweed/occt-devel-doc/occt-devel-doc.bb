SUMMARY = "Development files for occt"
DESCRIPTION = "Developer documentation for OpenCASCADE"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "occt-devel-doc-7.9.3-1.4.noarch.rpm"
RPM_HASH = "ec54a3a04abb79be849062c7a6ded7fffbc5fa8c65cd00f1e118a5bd507331d9b82222344b59a8f4ea75e394fb3d14ccfc4d8cac907680037dcb443760ef94df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
