SUMMARY = "Javadoc for apache-commons-logging"
DESCRIPTION = "Javadoc for apache-commons-logging."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "apache-commons-logging-javadoc-1.4.0-1.2.noarch.rpm"
RPM_HASH = "8e8b9f62043faea12cb14e947b6247b768de00ea5bed19b9c44f6b001c1e465a20a78fe5260e5f2ee90a39eaf63eed3a27dbdf965da4d5391ed0b721cabdbe28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-logging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
