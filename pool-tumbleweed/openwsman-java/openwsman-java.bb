SUMMARY = "Java bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Java bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-java-2.8.1-5.1.noarch.rpm"
RPM_HASH = "cd5a903c57e50dbaf5c2904a8ddd200fe4f11359ecaa24838845c7c24627dcaa202dedc0e961c93c5a086bf4de718b54cc3cd04cc608fb7308a89835c37c971d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-java"

RDEPENDS:${PN} += "java \
libwsman1"

inherit rpm
