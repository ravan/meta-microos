SUMMARY = "API documentation for xmvn5-tools"
DESCRIPTION = "This package provides API documentation for xmvn5-tools."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-tools-javadoc-5.1.0-3.1.noarch.rpm"
RPM_HASH = "7c1ac34c97135ec77d810fb1f901556dbb1b72ca3a044b232c7418955d68513bca76649c15b80ab774a719cfad6964fb329bd70c4757ebe7f40453de197e6914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn5-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
