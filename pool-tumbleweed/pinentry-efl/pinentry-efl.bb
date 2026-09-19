SUMMARY = "Simple PIN or Passphrase Entry Dialog for EFL"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-efl-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "a0d4fe0d0f86b3aad56c7abd94ad571309131aaef5f8580f2c3c7e35a1216c6e997b5e774879d0a98e3e4a8f5f965dc7b2411cf73484eae5e9393ef5b9baf377"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-efl \
pinentry-dialog \
pinentry-efl \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libecore-x.so.1 \
libecore.so.1 \
libelementary.so.1 \
libevas.so.1 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
