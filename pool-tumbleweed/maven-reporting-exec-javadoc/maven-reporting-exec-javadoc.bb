SUMMARY = "API documentation for maven-reporting-exec"
DESCRIPTION = "The API documentation of maven-reporting-exec."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "maven-reporting-exec-javadoc-2.0.1-1.2.noarch.rpm"
RPM_HASH = "274948a44dd77901e296d78ec27ad30d92b538703e7fc13811eb60246686069a4f3808bafa7a2ffcb3110c4501149baf12c783e71302a778d70adff4a452f615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
