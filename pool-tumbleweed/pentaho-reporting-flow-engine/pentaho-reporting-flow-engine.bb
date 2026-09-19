SUMMARY = "Pentaho Flow Reporting Engine"
DESCRIPTION = "Pentaho Reporting Flow Engine is a free Java report library, formerly \
known as 'JFreeReport'"
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-0.9.4-6.17.noarch.rpm"
RPM_HASH = "504ee67ab4a388c35bed6b1560e69914e34d749b2f52cf8106ca8035b760efffadf330cf679a4267dbf3a3e07e3491625e5b59c6f2ecc5730307b4fca887b600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine"

RDEPENDS:${PN} += "flute \
java \
jpackage-utils \
libbase \
libfonts \
libformula \
liblayout \
librepository \
libserializer \
pentaho-libxml \
sac"

inherit rpm
