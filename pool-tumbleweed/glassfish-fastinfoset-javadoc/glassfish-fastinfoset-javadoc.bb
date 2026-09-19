SUMMARY = "Javadoc for glassfish-fastinfoset"
DESCRIPTION = "This package contains javadoc for glassfish-fastinfoset."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-javadoc-1.2.15-9.4.noarch.rpm"
RPM_HASH = "35347cadc59df41366f840c1889e678e1fb1324109e49cbe3ecdb20482a3edcad6be93c15a8aca222bc8d2fcae7734bea46388617e61c6194081dde7045eba3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
