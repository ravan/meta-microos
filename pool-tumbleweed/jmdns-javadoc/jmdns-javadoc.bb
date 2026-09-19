SUMMARY = "API documentation for jmdns"
DESCRIPTION = "API documentation for jmdns."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-javadoc-3.5.7-5.3.noarch.rpm"
RPM_HASH = "a88acdbc9035c4f1c6515ebfadb3043b4f22647c2827b0fde18cf3409ccb69691acf8c9fb145f2c067200a7b7c377aea2a406e671126b0de648957883adc6220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
