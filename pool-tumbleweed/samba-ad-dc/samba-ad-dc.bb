SUMMARY = "Samba Active Directory-compatible Domain Controller"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller"
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-ad-dc-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "10802f85d7f75dd5d8673662e714317994add5bf79043bdf711c41019e78b2d17905cbf78ea459a565337ce0c14971c97ef2ca14a5f4255d023c07ce9180bc55"

RPROVIDES:${PN} += "samba-ad-dc \
samba-kdc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMESSAGING-SEND-private-samba.so \
libMESSAGING-private-samba.so \
libc.so.6 \
libcliauth-private-samba.so \
libcluster-private-samba.so \
libcmdline-private-samba.so \
libevents-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libldb.so.2 \
libndr-samba4-private-samba.so \
libpopt.so.0 \
libprocess-model-private-samba.so \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-hostconfig.so.0 \
libsamba-util.so.0 \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libservice-private-samba.so \
libsmbconf.so.0 \
libsocket-blocking-private-samba.so \
libtalloc.so.2 \
libtevent.so.0 \
samba \
samba-dsdb-modules \
samba-python3 \
samba-tool"

inherit rpm
