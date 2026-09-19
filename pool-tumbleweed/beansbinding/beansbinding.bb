SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-1.2.1-29.24.noarch.rpm"
RPM_HASH = "9035990db27d9546baebfb1fdc62b5eee351d8c5ecc5076b4d35c22827fe21ca656385929b20c19b83babac2d058611cdcb0ccdf04ac3d170773436871d46447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding"

RDEPENDS:${PN} += "java"

inherit rpm
