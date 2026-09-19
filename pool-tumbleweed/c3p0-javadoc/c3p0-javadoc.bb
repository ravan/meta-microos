SUMMARY = "Javadoc for c3p0"
DESCRIPTION = "Javadoc documentation for c3p0."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "c3p0-javadoc-0.14.1-1.2.noarch.rpm"
RPM_HASH = "3848f510246631c478d97b1ce13ea7806461a090fe184d309daee0fc110243870d1fe4ff0c7bb198c17940176e145fcea56ca91e5a161f7662713bda8dcaba26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
