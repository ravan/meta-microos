SUMMARY = "Simple PIN or Passphrase Entry Dialog integrated into Emacs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, integrated into Emacs."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-emacs-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "7c8e235fc13a5b5da277434f3bf94c4798360c700d20d925372e20bc1ca6cba485f0b38b6d8e89e3ce582f4236a65538244b174282c8a3bde151b70fd1de2ec5"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-emacs \
pinentry-dialog \
pinentry-emacs \
pinentry-gui"

RDEPENDS:${PN} += "emacs \
ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libsecret-1.so.0 \
pinentry"

inherit rpm
