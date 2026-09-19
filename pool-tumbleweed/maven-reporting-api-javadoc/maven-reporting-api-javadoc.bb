SUMMARY = "Javadoc for maven-reporting-api"
DESCRIPTION = "API documentation for maven-reporting-api."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "maven-reporting-api-javadoc-4.0.0-1.8.noarch.rpm"
RPM_HASH = "b4d4b355dcc7a1daf7a6302343fad2b351b83bf998ee3aefcbcb7e281b38a24384619cb0bed35aeaf1a14811788be6213aa637c13f72f0815986233a5cda7b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
