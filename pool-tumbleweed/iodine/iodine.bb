SUMMARY = "IPv4-through-DNS tunnel server and client"
DESCRIPTION = "This software lets one tunnel IPv4 data through a DNS server. This \
can be usable in different situations where internet access is \
firewalled, but DNS queries are allowed."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "iodine-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "c9876cb21ddf9626eeb3a13d86da7637845693b5b6ff25b32912f0cfc3c7a8510b9b686b2956fe640c6fd69604e30d6d4b1926c25017deccb87ab740861112c9"

RPROVIDES:${PN} += "group-iodined \
iodine \
user-iodined"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nobody \
libc.so.6 \
libselinux.so.1 \
libz.so.1 \
net-tools-deprecated \
sysuser-shadow"

inherit rpm
