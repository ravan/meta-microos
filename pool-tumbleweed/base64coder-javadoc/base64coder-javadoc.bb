SUMMARY = "API documentation for base64coder"
DESCRIPTION = "This package contains API documentation for base64coder."
LICENSE = "Apache-2.0 | EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-javadoc-20101219-3.10.noarch.rpm"
RPM_HASH = "4c1bb72c6dbfdc14ae13aa3b8a8115a4df3bd2c2cff8e5fc8ed12f53adb47d7cf6bf1b354826bbdc3917f15a457e44f8c305b5ffa5583661d3e554cd95cd8fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
