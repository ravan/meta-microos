SUMMARY = "Java UML Tool"
DESCRIPTION = "PlantUML is a program allowing to draw UML diagrams, using a simple \
and human readable text description. It is extremely useful for code \
documenting, sketching project architecture during team conversations \
and so on. \
 \
PlantUML supports the following diagram types \
  - sequence diagram \
  - use case diagram \
  - class diagram \
  - activity diagram \
  - component diagram \
  - state diagram"
LICENSE = "GPL-3.0-or-later"

PV = "1.2025.2"

RPM_NAME = "plantuml-1.2025.2-1.6.noarch.rpm"
RPM_HASH = "7d740d994f822937834beff25d71d25dd5a067483a2c032a71131a94042c1ffab346980e5b6ec967f35c12fb805492115b027d1392d41efedf5c85d468aede00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.plantuml-plantuml \
plantuml"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
