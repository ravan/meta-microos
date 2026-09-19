SUMMARY = "Javadoc for super-csv"
DESCRIPTION = "This package contains javadoc for super-csv."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-javadoc-2.4.0-7.10.noarch.rpm"
RPM_HASH = "b694dba404af39ce257d976df2d0d0f95f64aec035075a23087793c79ce8628ed24bd76863f62cd95028ad32f2a0e7d64888b5f4770b2a093a2a62c4317ce9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "super-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
