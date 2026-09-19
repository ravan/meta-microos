SUMMARY = "DOSBox Game Launcher"
DESCRIPTION = "DBGL is a Java front-end for DOSBox, based largely upon the \
proven interface of D-Fend."
LICENSE = "GPL-2.0-only"

PV = "0.99"

RPM_NAME = "dbgl-0.99-1.5.noarch.rpm"
RPM_HASH = "c3604d7c4f58d4e9c36487763c87dd14a2bd3763676411e15004b37372ec6e854d5c0448263cb0704feb9a59189feb50f34658e89b0b11558a95c51328e15224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbgl"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-io \
apache-commons-lang3 \
apache-commons-text \
dosbox \
eclipse-swt \
java \
javapackages-tools"

inherit rpm
