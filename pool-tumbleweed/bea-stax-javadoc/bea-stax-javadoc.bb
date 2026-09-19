SUMMARY = "Javadoc for bea-stax"
DESCRIPTION = "bea-stax API documentation."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-javadoc-1.2.0-1.8.noarch.rpm"
RPM_HASH = "80a6cd65aa71c246af56d7332f79699a984dfd583c9397a2017de8386b5a7d420e3536b654298615211ce1f945e1c94493830d46ebc408ec6160e97b42decfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
