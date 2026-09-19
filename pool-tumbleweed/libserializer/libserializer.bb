SUMMARY = "JFreeReport General Serialization Framework"
DESCRIPTION = "Libserializer contains a general serialization framework that simplifies the \
task of writing custom java serialization handlers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-1.1.6-2.9.noarch.rpm"
RPM_HASH = "edc786f912035225a5d008beac8937e689f240978101e619cf9f79075c6ff1598ef406ebbf0e6306ba4c0bb972ca8bc0a2e1b58bd701471172e91d58902d4bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer"

RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm
