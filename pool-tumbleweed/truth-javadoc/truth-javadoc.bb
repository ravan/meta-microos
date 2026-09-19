SUMMARY = "Javadoc for truth"
DESCRIPTION = "This package contains the API documentation for truth."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-javadoc-0.24-4.4.noarch.rpm"
RPM_HASH = "f45c04d0e709417d71f84fe11d636954f45a3d252e02523e90cb0d4be16869e3e687298126b75a62cb24f5c2cb013311736a9009203f867b38af019a7b67d29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "truth-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
