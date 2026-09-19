SUMMARY = "OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = " \
The ibutils package provides a set of diagnostic tools that check the health \
of an InfiniBand fabric. \
 \
Package components: \
ibis:     IB interface - A TCL shell that provides interface for sending various \
          MADs on the IB fabric. This is the component that actually accesses \
          the IB Hardware. \
 \
ibdm:     IB Data Model - A library that provides IB fabric analysis. \
 \
ibmgtsim: An IB fabric simulator. Useful for developing IB tools. \
 \
ibdiag:   This package provides two tools which provide the user interface \
          to activate the above functionality: \
            - ibdiagnet:  Performs various quality and health checks on the IB \
                          fabric. \
            - ibdiagpath: Performs various fabric quality and health checks on \
                          the given links and nodes in a specific path."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-1.5.7.0.2-12.9.aarch64.rpm"
RPM_HASH = "dea0cfd8593008ec3332565cbb9cd55ada5f6444ad39add8eb6355a024a5694477abf25fb0e1a7a7022340d43bea89765098cc6e76a3c21656e92dcf47e4db14"

RPROVIDES:${PN} += "ibutils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libibdmcom.so.1 \
libopensm.so.9 \
libosmcomp.so.5 \
libosmvendor.so.5 \
libstdc++.so.6 \
libtcl8.6.so"

inherit rpm
