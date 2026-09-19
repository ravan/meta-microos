SUMMARY = "Documentation for GLM library"
DESCRIPTION = "This package provides the documentation for GLM library."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.0.1"

RPM_NAME = "glm-doc-1.0.1-1.5.noarch.rpm"
RPM_HASH = "0510bff81a77e961d65ea42da59b07bd36a66ddb3a6c578e6726f1f35df4bf357fb155f3bc40aeaf2bf94657924d9717e45c79a510480983e0975d0b106005f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glm-doc"

RDEPENDS:${PN} += ""

inherit rpm
