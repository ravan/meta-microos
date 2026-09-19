SUMMARY = "Tools to manage systemd-sysext images"
DESCRIPTION = "sysextmgr is used to manage systemd-sysext images on the system: list \
available extensions, install and update them. \
sysextmgrcli is a commandline interface to communicate with the sysextmgr \
daemon via varlink."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0+git20260820.0628c3a"

RPM_NAME = "sysextmgr-1.3.0+git20260820.0628c3a-1.1.aarch64.rpm"
RPM_HASH = "713a9e51973ffd02cfe1cd4a738a2de413591c8e988d384917ea9a3a31a92282fd2d783ab21824cc459aa5363eb2248841e2303c4a881c500234a6653004b852"

RPROVIDES:${PN} += "sysextmgr \
sysextmgrcli"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/systemd-dissect \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libpcre2-8.so.0 \
libsmartcols.so.1 \
libsystemd.so.0 \
libzio.so.1 \
systemd-container"

inherit rpm
