SUMMARY = "Host Name Resolution Via Multicast DNS (Zeroconf) for glibc"
DESCRIPTION = "nss-mdns is a plug-in for the GNU Name Service Switch (NSS) \
functionality of the GNU C Library (glibc) providing a hostname \
resolution via Multicast DNS (aka Zeroconf, aka Apple Rendezvous, aka \
Apple Bonjour), and effectively allowing name resolution by common \
Unix/Linux programs in the ad-hoc mDNS domain .local. \
 \
nss-mdns provides only client functionality, which means that you have \
to run a mDNS responder daemon separately from nss-mdns if you want to \
register the local hostname via mDNS. I recommend Avahi. \
 \
By default, nss-mdns tries to contact a running avahi-daemon to resolve \
hostnames and addresses and makes use of its superior record cacheing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.1"

RPM_NAME = "nss-mdns-0.15.1-2.4.aarch64.rpm"
RPM_HASH = "d3d6c5b09c01e3e2918e5f04204404ceea91e9125a4edce68cedaec5191c85a5e628dc911a1bb16cf1c8d53475755886da2a16985caacf1782a40341ca55f279"

RPROVIDES:${PN} += "libnss-mdns-minimal.so.2 \
libnss-mdns.so.2 \
libnss-mdns4-minimal.so.2 \
libnss-mdns4.so.2 \
libnss-mdns6-minimal.so.2 \
libnss-mdns6.so.2 \
nss-mdns"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
avahi \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
nsswitch-config \
sed"

inherit rpm
