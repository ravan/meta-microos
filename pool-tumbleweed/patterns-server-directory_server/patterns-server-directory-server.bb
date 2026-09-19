SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "Software to set up a directory server with 389-DS. The Lightweight Directory Access Protocol (LDAP) is used to access online directory services."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-directory_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "bd879162407938cd8734df6a1673fbffd60d88a637b4fc5f20c8717448d7c2db2d34acbdab2bf69c858dce6d85c46d7381f6d2ed8f0000db7340b1827067a0d9"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-directory-server \
patterns-server-directory-server"

RDEPENDS:${PN} += "389-ds \
pattern-"

inherit rpm
