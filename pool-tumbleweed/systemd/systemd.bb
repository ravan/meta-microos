SUMMARY = "A System and Session Manager"
DESCRIPTION = "Systemd is a system and service manager, compatible with SysV and LSB \
init scripts for Linux. systemd provides aggressive parallelization \
capabilities, uses socket and D-Bus activation for starting services, \
offers on-demand starting of daemons, keeps track of processes using \
Linux cgroups, supports snapshotting and restoring of the system state, \
maintains mount and automount points and implements an elaborate \
transactional dependency-based service control logic. It can work as a \
drop-in replacement for sysvinit."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-261.2-1.2.aarch64.rpm"
RPM_HASH = "1875395339d91fde09b417302ee2f0c5db2b4e8fe1ce77cd8d4600d395a36781e698386db0536f1a871595888c4c273eecbf2689c51f7750ddb30c670d362538"

RPROVIDES:${PN} += "/sbin/shutdown \
config-systemd \
group-systemd-coredump \
group-systemd-journal \
libnss-myhostname.so.2 \
libnss-systemd.so.2 \
libsystemd-core-261.2-1.2.so \
libsystemd-shared-261.2-1.2.so \
nss-myhostname \
nss-systemd \
pkgconfig-systemd \
sbin-init \
systemd \
systemd-coredump \
systemd-logger \
sysvinit-/sbin/init \
user-systemd-coredump"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
aaa-base \
coreutils \
dbus-service \
findutils \
kbd \
ld-linux-aarch64.so.1 \
libacl1 \
libaudit1 \
libc.so.6 \
libm.so.6 \
libmount1 \
libnss-usrfiles2 \
libseccomp2 \
libselinux1 \
netcfg \
pam-config \
systemd-default-settings-branding \
systemd-presets-branding \
util-linux"

inherit rpm
