SUMMARY = "Development documentation for PolicyKit"
DESCRIPTION = "Development documentation for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "polkit-doc-127-7.2.noarch.rpm"
RPM_HASH = "05fa58d8bedafbcfb5de83a6dbae2fd76793d9dab39d81ac33e75381794e35508b42b50c2ac010bce0e0ab8ec2dd99af3852dc9223b3cf039dbb8c1dfd7ed822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-doc"

RDEPENDS:${PN} += ""

inherit rpm
