SUMMARY = "Javadoc for scala-stm"
DESCRIPTION = "This package contains javadoc for scala-stm."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "scala-stm-javadoc-0.11.1-2.7.noarch.rpm"
RPM_HASH = "ded31e65cc9ae639a09164be5cd7de73a44c9f5c934c425a0be81e948b92ba497bb4dd92ccfb502761d5a2aaf624cb335d3f926e92951a55a1a3db5413c416aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-stm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
