SUMMARY = "Fast NTLM authentication proxy with tunneling"
DESCRIPTION = "Cntlm is a fast and efficient NTLM proxy, with support for TCP/IP tunneling, \
authenticated connection caching, ACLs, proper daemon logging and behaviour \
and much more. It has up to ten times faster responses than similar NTLM \
proxies, while using by orders or magnitude less RAM and CPU. Manual page \
contains detailed information."
LICENSE = "GPL-2.0-or-later"

PV = "0.94.0"

RPM_NAME = "cntlm-0.94.0-1.3.aarch64.rpm"
RPM_HASH = "30aeab40142003cedea4fb4304bd46b769e7ab38c30dc3391544e429c9adc34e6249097e5f2fe63f1e0463af6d2edfdee64a73ce20b7948ca06ac69b8510170f"

RPROVIDES:${PN} += "bundled-duktape \
cntlm \
config-cntlm \
user-cntlm"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
shadow \
systemd"

inherit rpm
