SUMMARY = "Documentation for the libaom API"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains the API documentation for libaom, a library \
for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.13.1"

RPM_NAME = "libaom-devel-doc-3.13.1-2.3.noarch.rpm"
RPM_HASH = "4b0bf6ba2984cf89e527dd354f1947b88cda9169c43d83f6110de1cb4a618b91469b28dfd3571bb2d520b358e6d314eb0048fe28703285de7a6567a9c575d01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaom-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
