SUMMARY = "Password storage implementation based on GNOME Keyring"
DESCRIPTION = "Password storage implementation based on GNOME Keyring."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0000"

RPM_NAME = "perl-Passwd-Keyring-Gnome-1.0000-1.32.aarch64.rpm"
RPM_HASH = "449ffbdff1784960a228f3c8f3f4b0e921d6e2470db0a178942a1dadf9f46514a593d26ee9edd99f0d1559b1062f972125339c50bcef774c24d4e10b544c5312"

RPROVIDES:${PN} += "perl-Passwd--Keyring--Gnome \
perl-Passwd-Keyring-Gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir"

inherit rpm
