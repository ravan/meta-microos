SUMMARY = "PAM Module for SSH Authentication"
DESCRIPTION = "This module provides single sign-on behavior. The user types a \
passphrase when logging in and is allowed in if it decrypts the user s \
SSH private key. An ssh-agent is started and keys are added. For the \
entire session, the user types no more passwords."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "pam_ssh-2.3-5.5.aarch64.rpm"
RPM_HASH = "d66a2449870543a6c261ca20d5a8a27057d609d33902e2c0ba799cbcd8ebcc20f917808d393c328a95663825c342e46883568a8ed4209e837abfff91063d40f0"

RPROVIDES:${PN} += "pam-ssh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpam.so.0"

inherit rpm
