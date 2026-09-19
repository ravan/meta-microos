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

RPM_NAME = "systemd-mini-261.2-1.1.aarch64.rpm"
RPM_HASH = "c80045fce8f829fc2d87c8e20d56febbc309dc833cc84d27424576d58c51188fc0174b4c415823ec11a5bf014bb24047da25f7061d000fa841041536cda545be"

RPROVIDES:${PN} += "/sbin/shutdown \
config-systemd-mini \
group-systemd-journal \
libsystemd-core-261.2-1.1.so \
libsystemd-shared-261.2-1.1.so \
nss-myhostname \
nss-systemd \
pkgconfig-systemd \
sbin-init \
systemd \
systemd-coredump \
systemd-logger \
systemd-mini \
sysvinit-/sbin/init"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
