SUMMARY = "Javadoc for objenesis"
DESCRIPTION = "This package contains the API documentation for objenesis."
LICENSE = "Apache-2.0"

PV = "3.3"

RPM_NAME = "objenesis-javadoc-3.3-3.8.noarch.rpm"
RPM_HASH = "1566d2d9bfb59d2942a14c8f06b8505dc4d3ae36d30ae38c96b045c32f4972c888f22d362de78fa085ac97e71fee986db6a6601b7203e11aeac5e5ba6905f97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objenesis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
