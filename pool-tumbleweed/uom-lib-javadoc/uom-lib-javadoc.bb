SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "This package contains documentation for the Units of Measurement \
Libraries (JSR 363)."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-javadoc-1.2-4.7.noarch.rpm"
RPM_HASH = "3952fcce41b7bcc6a1d436bbd5d620e45cde026fce3e9502d27781844f2a0abe20c29e96a6cd3d81b4bbf13cda58217df9db01a4b3b1c96973f6a02c90300e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uom-lib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
