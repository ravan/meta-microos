SUMMARY = "ParaNamer Ant"
DESCRIPTION = "This package contains the ParaNamer Ant tasks."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-ant-2.8-4.10.noarch.rpm"
RPM_HASH = "df4d71f80d945cd05e46a2b8cd5b313a6f87cc803b41528d1f2b8f81fff0d2557cc2394c1f05c567e0b72a001f90dca0b58e76a17129a364803a0a50e1d412d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-ant \
mvn-com.thoughtworks.paranamer-paranamer-ant-pom- \
paranamer-ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.ant-ant"

inherit rpm
