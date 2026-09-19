SUMMARY = "Systemd Network Name Resolution Manager"
DESCRIPTION = "systemd-resolved is a system service that provides network name resolution to \
local applications. It implements a caching and validating DNS/DNSSEC stub \
resolver, as well as an LLMNR and MulticastDNS resolver and responder. It may be \
controlled by resolvectl(1). \
 \
Additionally, this package also contains a plug-in module for the Name Service \
Switch (NSS), which enables hostname resolutions by contacting \
systemd-resolved(8). It replaces the nss-dns plug-in module that traditionally \
resolves hostnames via DNS. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-resolve(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-resolved-261.2-1.2.aarch64.rpm"
RPM_HASH = "7b684c4986561320e41b6909922867b8f30a5a19aa1204937dab2ce2cd08406f0b90b7cebd78b31ab7b4f41ef5cddf3922ebc8c183c47ce158f21fc9d799239b"

RPROVIDES:${PN} += "group-systemd-resolve \
libnss-resolve.so.2 \
nss-resolve \
systemd-network-/usr/lib/systemd/systemd-resolved \
systemd-resolved \
user-systemd-resolve"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd \
sysuser-shadow"

inherit rpm
