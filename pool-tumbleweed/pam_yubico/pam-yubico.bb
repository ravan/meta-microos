SUMMARY = "Yubico Pluggable Authentication Module (PAM)"
DESCRIPTION = " \
The Yubico PAM module provides an easy way to integrate the YubiKey into your \
existing user authentication infrastructure. PAM is used by GNU/Linux, Solaris \
and Mac OS X for user authentication, and by other specialized applications \
such as NCSA MyProxy."
LICENSE = "BSD-2-Clause"

PV = "2.27"

RPM_NAME = "pam_yubico-2.27-2.20.aarch64.rpm"
RPM_HASH = "e9bfed2feb8f7daaad0b350847200ad8a4ff7b95f06a182432936f287d5c186f5dfa6b1cadc3df4f791714da075f171031bc7eb0f53c2e28ec40c24c8597eec7"

RPROVIDES:${PN} += "pam-yubico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
libykclient.so.3 \
libykpers-1.so.1 \
libyubikey.so.0"

inherit rpm
