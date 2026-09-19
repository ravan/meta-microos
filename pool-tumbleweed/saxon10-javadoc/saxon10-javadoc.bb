SUMMARY = "Javadoc for saxon10"
DESCRIPTION = "Javadoc for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-javadoc-10.9-5.5.noarch.rpm"
RPM_HASH = "cebdc5e2c9f4fe89fcfc532c507ffe45644efbf57fb0096fa6574f60e3d0e3fca9df2013eaaa38ab15d15ea372d41200e70305aeec5442a54abf769e0bfd3d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
