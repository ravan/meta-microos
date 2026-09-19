SUMMARY = "Service for authentication and account management"
DESCRIPTION = "The account-utils package contains the utilities and services to do user management and authentication without the need for setuid/setgid binaries. This allows the stack to work with `NoNewPrivs` enabled (means setuid/setgid binaries will no longer work). Communication happens via varlink."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause & LGPL-2.1-or-later"

PV = "1.4.0+git20260717.3914e08"

RPM_NAME = "account-utils-1.4.0+git20260717.3914e08-2.1.aarch64.rpm"
RPM_HASH = "b52342a99d904cecb31dd1b9235664b3e3cb2913626ff20e41d683088ba31ffa683fc023c979f632a22c8bb1ee8dda19da87cb474c1329e3d148ed0226732288"

RPROVIDES:${PN} += "account-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libeconf.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libpwaccess.so.0 \
libselinux.so.1 \
libsystemd.so.0 \
pam-config"

inherit rpm
