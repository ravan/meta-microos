SUMMARY = "A recursive content discovery tool"
DESCRIPTION = "Forced browsing is an attack where the aim is to enumerate and access \
resources that are not referenced by the web application, but are \
still accessible by an attacker. \
 \
feroxbuster uses brute force combined with a wordlist to search for \
unlinked content in target directories. These resources may store \
sensitive information about web applications and operational systems, \
such as source code, credentials, internal network addressing, etc... \
 \
This attack is also known as Predictable Resource Location, File \
Enumeration, Directory Enumeration, and Resource Enumeration."
LICENSE = "MIT"

PV = "2.13.1"

RPM_NAME = "feroxbuster-2.13.1-1.7.aarch64.rpm"
RPM_HASH = "d1122fa8bc64b1f0de027358f4c669b2dd0c34c99df7fa8d3849820123b6ceb9c52a4f3e3f11b307968cabf879276ce84d6388ae6b6d0fc9c0821af602ea7b42"

RPROVIDES:${PN} += "feroxbuster"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
