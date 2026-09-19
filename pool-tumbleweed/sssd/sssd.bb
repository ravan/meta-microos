SUMMARY = "System Security Services Daemon"
DESCRIPTION = "A set of daemons to manage access to remote directories and \
authentication mechanisms. sssd provides an NSS and PAM interfaces \
toward the system and a pluggable backend system to connect to \
multiple different account sources. It is also the basis to provide \
client auditing and policy services for projects like FreeIPA."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "365e6989491cabde8451b407f0cfbb0692d05fc677ece0c5110749149810283007033a611ab471b361158e1bd0be80bc1e9f12de6d15f1fc16be042f6d057066"

RPROVIDES:${PN} += "config-sssd \
group-sssd \
libifp-iface-sync.so \
libifp-iface.so \
libnss-sss.so.2 \
libsss-autofs.so \
libsss-cert.so \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-iface-sync.so \
libsss-iface.so \
libsss-sbus-sync.so \
libsss-sbus.so \
libsss-simple.so \
libsss-sudo \
libsss-sudo.so \
libsss-util.so \
libsubid-sss.so \
sssd \
sssd-client \
sssd-common \
user-sssd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcares.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libdhash.so.1 \
libgssapi-krb5.so.2 \
libini-config.so.8 \
libkeyutils.so.1 \
libkrb5.so.3 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libp11-kit.so.0 \
libpam.so.0 \
libpcre2-8.so.0 \
libpopt.so.0 \
libselinux.so.1 \
libsemanage.so.2 \
libssl.so.3 \
libsss-certmap.so.0 \
libsss-idmap.so.0 \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
libunistring.so.5 \
pam-config \
permissions \
sssd-ldap \
sysuser-shadow"

inherit rpm
