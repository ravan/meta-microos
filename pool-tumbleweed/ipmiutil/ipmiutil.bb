SUMMARY = "Easy-to-use IPMI server management utilities"
DESCRIPTION = "The ipmiutil package provides easy-to-use utilities to view the SEL, \
perform an IPMI chassis reset, set up the IPMI LAN and Platform Event Filter \
entries to allow SNMP alerts, Serial-Over-LAN console, event daemon, and \
other IPMI tasks. \
These can be invoked with the metacommand ipmiutil, or via subcommand \
shortcuts as well.  IPMIUTIL can also write sensor thresholds, FRU asset tags, \
and has a full IPMI configuration save/restore. \
An IPMI driver can be provided by either the OpenIPMI driver (/dev/ipmi0) \
or the Intel IPMI driver (/dev/imb), etc.  If used locally and no driver is \
detected, ipmiutil will use user-space direct I/Os instead."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "ipmiutil-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "129f3ea973069ff8f394485c773bb8816751e5cdbd7854d630c8053954c0b6a0996c536d512a2ab06e880d966e31db70f823feb8cab80267f7f87b0ab493fb8e"

RPROVIDES:${PN} += "ipmiutil"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
