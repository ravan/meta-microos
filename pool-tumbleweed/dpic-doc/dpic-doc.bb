SUMMARY = "Documentation for dpic"
DESCRIPTION = " \
This package contains the documentation for dpic."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2025.08.01"

RPM_NAME = "dpic-doc-2025.08.01-1.3.noarch.rpm"
RPM_HASH = "127b9d8c3d1b073c3b39ea6dd02e935d85d9da2ade841c9c28c9ea67cbed81ed88e3bda06f296cf2ab826b3b8f26dfd3ff3e9b738b283d40c0cf6537aa962681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpic-doc"

RDEPENDS:${PN} += "dpic"

inherit rpm
