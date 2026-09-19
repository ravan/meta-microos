SUMMARY = "CLAT / SIIT-DC Edge Relay implementation for Linux"
DESCRIPTION = "clatd implements the CLAT component of the 464XLAT network architecture \
specified in RFC 6877. It allows an IPv6-only host to have IPv4 \
connectivity that is translated to IPv6 before being routed to an upstream \
PLAT (which is typically a Stateful NAT64 operated by the ISP) and there \
translated back to IPv4 before being routed to the IPv4 internet."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "clatd-1.6-1.11.noarch.rpm"
RPM_HASH = "078174b45b3d3e6caacf6318b022af5bfca1fc3d521a02b440f1e53fc45308354aa551f35afb4f07344d83f7e7c518551b83215b1e3d2fa8a4a92cf0aee58c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clatd \
config-clatd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
iproute2 \
iptables \
perl \
perl-File--Temp \
perl-IO--Socket--IP \
perl-Net--DNS \
perl-Net--IP \
tayga"

inherit rpm
