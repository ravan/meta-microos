SUMMARY = "Osmocom Home Location Register for GSUP protocol towards OsmoSGSN and OsmoCSCN"
DESCRIPTION = "The GSUP HLR is a stand-alone HLR (Home Location Register) for SIM \
and USIM based subscribers which exposes the GSUP protocol towards \
its users. OsmoSGSN supports this protocol. \
 \
osmo-gsup-hlr is still very simplistic. It is a single-threaded \
architecture and uses only sqlite3 tables as back-end.  It is suitable \
for installations of the scale that OsmoNITB was able to handle.  It \
also lacks various features like fine-grained control of subscribed \
services (like supplementary services)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-hlr-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "bb027fe779202b512a8ba99b3fae488b54a5f5126ada2fd9e52845599c312a947fc44e52f29a7070a6398230207d151c9d52c2fbdc27842df1477c90b00a9fc2"

RPROVIDES:${PN} += "config-osmo-hlr \
osmo-hlr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi-drivers-dbd-sqlite3 \
libosmo-gsup-client.so.0 \
libosmo-mslookup.so.0 \
libosmoabis.so.17 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogsm.so.20 \
libosmovty.so.13 \
libsqlite3.so.0 \
libtalloc.so.2"

inherit rpm
