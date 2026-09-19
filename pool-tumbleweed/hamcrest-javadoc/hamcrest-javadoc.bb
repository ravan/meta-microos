SUMMARY = "Javadoc for hamcrest"
DESCRIPTION = "Javadoc for hamcrest."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "hamcrest-javadoc-3.0-1.8.noarch.rpm"
RPM_HASH = "d26195adbe0d38d1dc3f82aee4faf4845ef8f53079e0f89cc6f58925321704ede2df5212152fe865deb2359f1647fcc5b09f45165442add469ca306dd34e9ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
