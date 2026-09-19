SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-ldap-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "e57dae5929df1afb45a479320d13680652e5260c5fbf7383cb5074d97f1fe7fbd74c8eb634f07b1a83dd844c51a1a7c8a239c126b062c5ea876cf174dd08c17b"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
