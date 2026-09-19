SUMMARY = "Filter IP addresses matching IPv4/IPv6 CIDR specification"
DESCRIPTION = "grepcidr can be used as a stream filter when you need to compare a list of IP \
addresses against one or more Classless Inter-Domain Routing (CIDR) mask \
specifications. Think of grepcidr as a CIDR-aware grep; instead of using \
'grep 1.2.3.4' you can use 'grepcidr -e 1.2.3.4/30', for example. Multiple \
specifications, of arbitrary mask lengths, can be specified both on the \
command line or loaded from a file."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "grepcidr-2.0-2.9.aarch64.rpm"
RPM_HASH = "c1820c47bc085b7b446360557c9cab7100454604a9b42899c4036adffcc261f3c4b217155350db3c1eff469d40bd50f48e66323dfb8b019575a8d76bd651123e"

RPROVIDES:${PN} += "grepcidr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
