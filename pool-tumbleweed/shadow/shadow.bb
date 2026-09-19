SUMMARY = "Utilities to Manage User and Group Accounts"
DESCRIPTION = "This package includes the necessary programs for converting plain \
password files to the shadow password format and to manage user and \
group accounts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "shadow-4.20.2-2.1.aarch64.rpm"
RPM_HASH = "59fe73cae7de159771cff95fdaeb85c3f15d28d96ffa539f4650d38da53d75cd8a073dbdfc5a1ba368fc370d1d9d0cfe10c2090307aacfb71464a723431a4d68"

RPROVIDES:${PN} += "config-shadow \
pwdutils \
shadow \
shadow-utils \
useradd-or-adduser-dep"

RDEPENDS:${PN} += "/usr/bin/sh \
group-root \
group-shadow \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libeconf.so.0 \
libpam.so.0 \
libselinux.so.1 \
libsemanage.so.2 \
libsubid.so.6 \
login-defs \
permissions \
user-root"

inherit rpm
