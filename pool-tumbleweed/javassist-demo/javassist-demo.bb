SUMMARY = "Samples for javassist"
DESCRIPTION = "Samples for javassist. \
 \
Samples for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.30.2"

RPM_NAME = "javassist-demo-3.30.2-1.8.noarch.rpm"
RPM_HASH = "d6b7ac03b39f6a3618b7352e7b0ad5f98581c0abbf267c189fdb04f494e4fb0da7a02663a66a45159aed53a92894cd4cc4ddbeb6d4e4e726cb783475ca348628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-demo"

RDEPENDS:${PN} += "javassist"

inherit rpm
