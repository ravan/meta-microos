SUMMARY = "Javadoc for javassist"
DESCRIPTION = "Javadoc for javassist. \
 \
Javadoc for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.30.2"

RPM_NAME = "javassist-javadoc-3.30.2-1.8.noarch.rpm"
RPM_HASH = "1b7eb7cf716f5b83285ccd8fbd5ef95d057f38dd28b1ffbc53093c6a57bfc977a81d3c92f2624e9a1dc26e716df7747b43d112e22eb9ad3003f3f676d46822ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
