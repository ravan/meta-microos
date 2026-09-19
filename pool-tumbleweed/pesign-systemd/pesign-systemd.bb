SUMMARY = "Systemd units for pesign"
DESCRIPTION = "Systemd units for the pesign package."
LICENSE = "GPL-3.0-or-later"

PV = "116"

RPM_NAME = "pesign-systemd-116-11.2.noarch.rpm"
RPM_HASH = "b3fb53af0ac144731e3415e6dd6c49013318de1e24c2a54eac92e1bae9c0f01f995ad1d736a0bd9d896ff79274a5b990413b4fa6f86f7b68c01e22e7206f3f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pesign-/usr/lib/systemd/system/pesign.service \
pesign-/usr/lib/tmpfiles.d/pesign.conf \
pesign-/usr/sbin/rcpesign \
pesign-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-pesign \
pesign \
systemd \
user-pesign"

inherit rpm
