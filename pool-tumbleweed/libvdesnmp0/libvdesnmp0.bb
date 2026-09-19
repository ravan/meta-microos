SUMMARY = "VDE snmp library"
DESCRIPTION = "This package contains VDE snmp library \
SNMP library for Virtual Distributed Ethernet"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp0-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "5d574588f3296809e5cd7d65b509137480b65e6299a0979d7b91e5b517f1a88a68ac61524268a51dcc62c0b9ac859fefd65cb27d9b0cfade0015870a0d04ceec"

RPROVIDES:${PN} += "libvdesnmp.so.0 \
libvdesnmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvdemgmt.so.0"

inherit rpm
