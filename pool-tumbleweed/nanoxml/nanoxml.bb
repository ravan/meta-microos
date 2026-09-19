SUMMARY = "Small non-validating XML parser for Java"
DESCRIPTION = "NanoXML is a small non-validating parser for Java. \
The full parser with builder fits in a JAR file of about 32K."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-2.2.3-6.10.noarch.rpm"
RPM_HASH = "61a9b1d286d95b65f7138af44a93bcc780b7b1da45d0b6536de8289d008b7a8a36eca9233c09b9b88178522a35aea14b7ee225ba49170fb6964a1cc9f9c67445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml"

RDEPENDS:${PN} += "java"

inherit rpm
