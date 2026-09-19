SUMMARY = "ISC DHCP pool analysis"
DESCRIPTION = "This is dhcpd-pools ISC dhcp shared network and pool range usage \
analysis. Purpose of command is to count usage ratio of each IP range \
and shared network pool which ISC dhcpd is in control of users of the \
command are most likely ISPs and other organizations that have large \
IP space. \
This tools can also be used as a Icinga/Nagios plugin."
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "dhcpd-pools-3.2-1.13.aarch64.rpm"
RPM_HASH = "accd3e3c9d828f7020f2415d7743a91ebf0cb17d892112ee14d5b038f4a564f105c3649114f2c48f7d69c3c461acd6078561272031e7fc6dc28a7bd71ca626e2"

RPROVIDES:${PN} += "dhcpd-pools"

RDEPENDS:${PN} += "dhcp-server \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
