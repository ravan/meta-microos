SUMMARY = "Javadoc for maven-filtering4"
DESCRIPTION = "This package contains the API documentation for maven-filtering4."
LICENSE = "Apache-2.0"

PV = "4.0.0~20260707.git2d20dde"

RPM_NAME = "maven-filtering4-javadoc-4.0.0~20260707.git2d20dde-1.1.noarch.rpm"
RPM_HASH = "85d52db23b8d6ad0f44410bc04dc7a73f13201b76813ba300601bf5c8d4c03ecfc286ca733c66a7d1fd0743c3d59098862957547546d5b3376831a6a27ba3c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
