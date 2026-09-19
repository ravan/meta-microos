SUMMARY = "Infiniband Subnet Manager"
DESCRIPTION = "OpenSM provides an implementation for an InfiniBand Subnet Manager and \
Administration. Such a software entity is required to run for in order \
to initialize the InfiniBand hardware (at least one per each InfiniBand \
subnet)."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "opensm-3.3.24-5.4.aarch64.rpm"
RPM_HASH = "055c5c2746e2f8fc19a83c0f4eb7293546da5cdbf33969ce7cf91136028432a63afee3c395a641a799d756ba65e7f3ba31397bbfcfe74f219209c4f9c0c04e8a"

RPROVIDES:${PN} += "config-opensm \
opensm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopensm.so.9 \
libosmcomp.so.5 \
libosmvendor.so.5 \
logrotate \
systemd"

inherit rpm
