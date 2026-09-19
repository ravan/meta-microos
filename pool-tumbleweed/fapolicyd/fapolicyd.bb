SUMMARY = "Application Whitelisting Daemon"
DESCRIPTION = "Fapolicyd (File Access Policy Daemon) implements application whitelisting \
to decide file access rights. Applications that are known via a reputation \
source are allowed access while unknown applications are not. The daemon \
makes use of the kernel's fanotify interface to determine file access rights."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "fapolicyd-1.4.3-2.3.aarch64.rpm"
RPM_HASH = "e18598ed49b7fb0906edcecea13bb8e286aef2f667df867c31a8ca232689db932fd67d5f45940af309f54f66755254ee6f899caf1a264e8a32626a727b5ba02d"

RPROVIDES:${PN} += "config-fapolicyd \
fapolicyd \
group-fapolicyd \
user-fapolicyd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcrypto.so.3 \
liblmdb-0.9.35.so \
libmagic.so.1 \
librpm.so.10 \
librpmio.so.10 \
libseccomp.so.2 \
libudev.so.1 \
shadow \
systemd"

inherit rpm
