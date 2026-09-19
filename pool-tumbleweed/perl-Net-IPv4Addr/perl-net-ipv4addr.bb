SUMMARY = "Net::IPv4Addr Module for Perl"
DESCRIPTION = "Net::IPv4Addr provides functions for parsing IPv4 addresses both in \
traditional address/netmask format and in the new CIDR format. There \
are also methods for calculating the network and broadcast address and \
also to see check if a given address is in a specific network. \
 \
Authors: \
-------- \
    Francis J. Lacoste <francis.lacoste@iNsu.COM>"
LICENSE = "GPL-2.0+"

PV = "0.10"

RPM_NAME = "perl-Net-IPv4Addr-0.10-167.9.aarch64.rpm"
RPM_HASH = "edd4c06cb9012c61d9c369f603702275ce93ec97a3b29432171fe32c452a8d517febc8596c6e3f11793ef6619885dc270ba19f445593511cf8fb679d53b0f1f1"

RPROVIDES:${PN} += "Net \
perl-Net--IPv4Addr \
perl-Net-IPv4Addr"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
