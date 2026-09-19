SUMMARY = "Javadoc for jboss-modules"
DESCRIPTION = "This package contains the API documentation for jboss-modules."
LICENSE = "Apache-2.0 & xpp"

PV = "1.5.2"

RPM_NAME = "jboss-modules-javadoc-1.5.2-1.37.noarch.rpm"
RPM_HASH = "adc52327a9aa5803b15acc3b219e050b64dfd22496e99eca4ddce0392db71d171c6fd1185bb1572987402f4724a6e85bca9c2847ffd0c0494d2aeb19ef404efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-modules-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
