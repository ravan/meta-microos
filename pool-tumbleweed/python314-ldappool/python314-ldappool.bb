SUMMARY = "A connection pool for python-ldap"
DESCRIPTION = "A simple connector pool for python-ldap. \
 \
The pool keeps LDAP connectors alive and let you reuse them, \
drastically reducing the time spent to initiate a ldap connection. \
 \
The pool has useful features like: \
 \
- transparent reconnection on failures or server restarts \
- configurable pool size and connectors timeouts \
- configurable max lifetime for connectors \
- a context manager to simplify acquiring and releasing a connector"
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "3.0.0"

RPM_NAME = "python314-ldappool-3.0.0-5.5.noarch.rpm"
RPM_HASH = "1ed8261be834e30a760fe4981a06070de5728c6676829d96acd203655ab16543c2afae2aaaf1b5b3e0a3427d971ec7e4747877f6517f19fd9ad65f2b54e6c427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ldappool \
python314-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python314-ldap \
python314-prettytable"

inherit rpm
