SUMMARY = "User Space Tool to Set Up and Maintain ARP Filtering Tables"
DESCRIPTION = "arptables is a user space tool used to set up and maintain the tables \
of ARP rules in the Linux kernel. These rules inspect the ARP frames. \
arptables is similar to the iptables userspace tool, but less \
complicated."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.5"

RPM_NAME = "arptables-0.0.5-1.24.aarch64.rpm"
RPM_HASH = "83a4d939f2a8d3ff145d5e42599853ea1eba5eda2da09a45846fc532dc907d6f19352c262c7825b167a92324d1a0dcef001075e7fc93b23f895ea7f67db0ba2c"

RPROVIDES:${PN} += "arptables"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
