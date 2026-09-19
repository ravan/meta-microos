SUMMARY = "Javadoc for jtb"
DESCRIPTION = "This package contains the API documentation for jtb."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "jtb-javadoc-1.5.1-1.11.noarch.rpm"
RPM_HASH = "4315d6ab93970c017a5c18e315f02e15c69a44cfe6243c18442c46d497f0d07058ca0d057ca68cddf6c56f25dd0bf9f3aac82a297211f40c66e21e6d8cbfecca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtb-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
