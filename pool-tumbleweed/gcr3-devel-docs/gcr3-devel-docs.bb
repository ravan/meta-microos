SUMMARY = "Development documents for gcr and gck"
DESCRIPTION = "Development documents for gcr and gck."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-devel-docs-3.41.2-5.4.noarch.rpm"
RPM_HASH = "3f944d754d20381a312dc49b1ffd445db45daff2be8910c76f26bb941c4836ea9c869e377ba187cd973ee8967ae933bf5f1aa214864c8e884724e64f5d35e218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr3-devel-docs"

RDEPENDS:${PN} += ""

inherit rpm
