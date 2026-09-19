SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-1.03-29.10.noarch.rpm"
RPM_HASH = "fc0e16e93884f474c0e10554ffc20ffc15eb6685ef12690a640e167f52521c795b420830ec24353e189c967777fced7ab6410c76af863848fd2565e0255ac3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework"

RDEPENDS:${PN} += "java \
swing-layout"

inherit rpm
