SUMMARY = "API documentation for jakarta-validation-api"
DESCRIPTION = "This package provides API documentation for jakarta-validation-api."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "jakarta-validation-api-javadoc-3.1.0-1.8.noarch.rpm"
RPM_HASH = "763363831458544dd1fa9617a4127a756366e5d265db3696fb88ee645f77c2fda0d6d957b095b5b9b479038463a8ba8cc06e8cc6a8b9ee47c3d0e803d9a164b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-validation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
