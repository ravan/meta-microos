SUMMARY = "CSS based layouting framework"
DESCRIPTION = "LibLayout is a layouting framework. It is based on the Cascading StyleSheets \
standard. The layouting expects to receive its content as a DOM structure \
(although it does not rely on the W3C-DOM API)."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-0.2.10-6.18.noarch.rpm"
RPM_HASH = "98d019fed914bd72583fd324603eb21d764c3273acf1b1604e7f3291ccf3de2f95e383075d3020a9e23b071d08fe3b41b703e43d2dab99f280869d384f074772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblayout"

RDEPENDS:${PN} += "flute \
java \
jpackage-utils \
libbase \
libfonts \
libloader \
librepository \
pentaho-libxml \
sac \
xml-commons-apis"

inherit rpm
