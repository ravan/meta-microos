SUMMARY = "API documentation for zstd-jni"
DESCRIPTION = "API documentation for zstd-jni"
LICENSE = "BSD-2-Clause"

PV = "1.5.7.16"

RPM_NAME = "zstd-jni-javadoc-1.5.7.16-1.1.noarch.rpm"
RPM_HASH = "939432d34b903084a5321d0ee21660ec18d3eec12cb86bfdbf03e5fc9cd13636ae6d158bf2678ef7057e4f139878a95ad0fe8033a70b87f0d0652b499bec36ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zstd-jni-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
