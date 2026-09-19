SUMMARY = "An authoritative DNS daemon"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "knot-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "10db535213ab8ea7e94c3b7e6675ab97da171d134563740f39dbb7ce2f90d8fe398462c9e2afbdb6dd169fecd8c944a41f9e3a9e5757a6119ac4880907ced107"

RPROVIDES:${PN} += "config-knot \
group-knot \
knot \
user-knot"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libedit.so.0 \
libfstrm.so.0 \
libgnutls.so.30 \
libhiredis.so.1.3.0 \
libknot.so.17 \
liblmdb-0.9.35.so \
libm.so.6 \
libmaxminddb.so.0 \
libprotobuf-c.so.1 \
libsystemd.so.0 \
liburcu.so.8 \
libzscanner.so.5 \
systemd \
sysuser-shadow"

inherit rpm
