SUMMARY = "Javadoc for parboiled"
DESCRIPTION = "This package contains javadoc for parboiled."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "parboiled-javadoc-1.4.1-4.9.noarch.rpm"
RPM_HASH = "7e8e141b849a856bc0a6e473b0836a86cb71fe24ebbf58a490ad22d468217a5cb42881d54fb83bd6e5d36a30055a59503f951fb1d6090451aaab670ed819561c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parboiled-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
