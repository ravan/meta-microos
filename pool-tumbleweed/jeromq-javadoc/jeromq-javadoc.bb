SUMMARY = "Javadoc for jeromq"
DESCRIPTION = "This package contains the API documentation for jeromq."
LICENSE = "MPL-2.0+"

PV = "0.5.3"

RPM_NAME = "jeromq-javadoc-0.5.3-2.4.noarch.rpm"
RPM_HASH = "ee621ed0f4a8f763d5d0ab76f07095b5891e93ae0d5fc6b45ab1a857c2daafae5e32d96569b91c2222949c373633b62e4c839995b669574efa39a29a359307e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
