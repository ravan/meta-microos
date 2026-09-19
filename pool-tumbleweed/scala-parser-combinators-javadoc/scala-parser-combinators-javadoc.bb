SUMMARY = "Javadoc for scala-parser-combinators"
DESCRIPTION = "This package contains javadoc for scala-parser-combinators."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "scala-parser-combinators-javadoc-2.3.0-2.7.noarch.rpm"
RPM_HASH = "8d5b06071132e329150dc76e12fcc8d894dceb8decdf88417bd2cff1e6702f0ff4359aecfb64f39991d71f735bf827d99bf65ccb47645e31ea3a04d2b1618b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-parser-combinators-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
