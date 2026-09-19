SUMMARY = "A collection of general purpose utilities for c3p0"
DESCRIPTION = "Originally part of c3p0, mchange-commons is a set of general purpose \
utilities."
LICENSE = "EPL-1.0 | LGPL-2.0-only"

PV = "0.6.1"

RPM_NAME = "mchange-commons-0.6.1-1.2.noarch.rpm"
RPM_HASH = "c993e7a48466a9fbef677a6cded1d09a0a644a77d8dd1ebef21e2ddc2f0c39c82af1556b99bc8d2e87fa1b6dce85d59a9cd2437e9a4175fa58cb335456d92286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mchange-commons \
mvn-com.mchange-mchange-commons-java \
mvn-com.mchange-mchange-commons-java-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
