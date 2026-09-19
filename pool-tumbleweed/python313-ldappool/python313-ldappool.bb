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

RPM_NAME = "python313-ldappool-3.0.0-5.5.noarch.rpm"
RPM_HASH = "9c37949eb252a8fac26c63c1fd17103cb3a637d8f251602364be89215284f048ff7b8a331fb93c1587e2afecdc59af419f74ed284da441cf3bb170b4752fa2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ldappool \
python3.13dist-ldappool \
python313-ldappool \
python3dist-ldappool"

RDEPENDS:${PN} += "python-abi \
python313-ldap \
python313-prettytable"

inherit rpm
