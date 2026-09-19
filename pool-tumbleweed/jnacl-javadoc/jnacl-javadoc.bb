SUMMARY = "Javadoc for jnacl"
DESCRIPTION = "This package contains API documentation for jnacl."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "jnacl-javadoc-1.0.0-5.7.noarch.rpm"
RPM_HASH = "cb01a84b6fcdba78124a9ac32c1bdee0ed58082e3ea79e8dcfdf7d295e9ffcd7c7eff00201a2cde281501df764301f9a1aa68d3516fbb6a53a3ced6813124deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnacl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
