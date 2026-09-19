SUMMARY = "XML DTD to XML instance format converter"
DESCRIPTION = "DTDinst is a program for converting XML DTDs into an XML instance format."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "dtdinst-20220510-5.10.noarch.rpm"
RPM_HASH = "50484c867f12698885076e7260bfe0cd4f468493794ba39f1e260808f3f6f519ebe6bfad3b7aad8e50554e5cd47cc595e301372e2888e0e54362510494ef2caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtdinst \
mvn-org.relaxng-dtdinst"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils"

inherit rpm
