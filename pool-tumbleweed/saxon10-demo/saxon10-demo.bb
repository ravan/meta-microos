SUMMARY = "Demos for saxon10"
DESCRIPTION = "Demonstrations and samples for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-demo-10.9-5.5.noarch.rpm"
RPM_HASH = "2575b89a649b7c6e7a9e59f4a8ace71d6214a31dd9fa79831ec82d6f483498d7873be36256d7b1633ac9a5b22d39af2e70cd96ad718feba24a0648a3d9b7741d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-demo"

RDEPENDS:${PN} += "saxon10"

inherit rpm
