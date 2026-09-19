SUMMARY = "Javadoc for jakarta-inject"
DESCRIPTION = "This package contains the API documentation for jakarta-inject."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-inject-javadoc-2.0.1-2.9.noarch.rpm"
RPM_HASH = "c5750a89bf8a425d314bc75532c98beda056735633b086e9dce16f302980677bd52f8fbcccae674e83ce75175a0a488157dfb2816d22e7c2de78e8c73d407b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-inject-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
