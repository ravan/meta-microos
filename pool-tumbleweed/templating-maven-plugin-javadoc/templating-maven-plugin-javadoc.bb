SUMMARY = "API documentation for templating-maven-plugin"
DESCRIPTION = "API documentation for templating-maven-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "templating-maven-plugin-javadoc-3.0.0-1.6.noarch.rpm"
RPM_HASH = "0f626caebc85779cb50ca5db444e28a0213c2318024802c150ad149db221924a77163ec800329aad3f917cf4bed353ec30672b98aab7d213647103fc785d14a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "templating-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
