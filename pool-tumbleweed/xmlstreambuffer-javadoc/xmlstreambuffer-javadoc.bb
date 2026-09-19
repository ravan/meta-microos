SUMMARY = "Javadoc for xmlstreambuffer"
DESCRIPTION = "This package contains javadoc for xmlstreambuffer."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.5.4"

RPM_NAME = "xmlstreambuffer-javadoc-1.5.4-6.4.noarch.rpm"
RPM_HASH = "3c2dd59f16e02311ffd3016569a77446c934453b53ceaa4c00c325b70c296fc3b486b1bbfaaf56e82da8a479c1fc0b9bd7b97f196c76bbf475b1e309a065e369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlstreambuffer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
