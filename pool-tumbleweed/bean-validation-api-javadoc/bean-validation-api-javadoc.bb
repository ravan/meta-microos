SUMMARY = "Javadoc for bean-validation-api"
DESCRIPTION = "This package contains the API documentation for bean-validation-api."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-javadoc-2.0.1-2.11.noarch.rpm"
RPM_HASH = "57179ded8a3b816387a1464aa63e8a04b590f7a59003a95da7361c916c054b8962bf0262feb3ac5d64a76b305e475194bda320ac44458bf85c46ac371624485a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
