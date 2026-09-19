SUMMARY = "GNOME Keyring - PAM module"
DESCRIPTION = "The GNOME Keyring is a daemon in the session, similar to ssh-agent, \
and other applications can use it to store passwords and other \
sensitive information. \
 \
The program can manage several keyrings, each with its own master \
password, and there is also a session keyring which is never stored to \
disk, but forgotten when the session ends. \
 \
The PAM module can be used to unlock the keyring on login."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "gnome-keyring-pam-50.0-3.2.aarch64.rpm"
RPM_HASH = "d21e00ecb79805f579aaa9c4b6e47320c1d767bc7a4e920a6c9e1252d4fd4c1568e78d56059ed822f7e9fb761a49714d603117b66cf3bf2c09c9badcc3a860bf"

RPROVIDES:${PN} += "gnome-keyring-pam \
pam-keyring"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
pam-config \
sed"

inherit rpm
