SUMMARY = "Zipios API documentation"
DESCRIPTION = "API documentation for zipios."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "zipios-devel-doc-2.3.2-1.11.noarch.rpm"
RPM_HASH = "00c2707896c30669f11e09f7aa0fb9f27f593bd0c7c3dd7431563d5f0078f6c58ad532240c69fca34ea13d2e1bd71542cd3d86bff123f042864ea0683f55be22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zipios-devel-/usr/share/doc/packages/zipios \
zipios-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
