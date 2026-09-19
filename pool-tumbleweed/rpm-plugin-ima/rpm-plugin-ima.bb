SUMMARY = "Rpm plugin for ima file signatures"
DESCRIPTION = "Rpm plugin for ima file signatures."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-ima-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "d8e7457ca4d91ec89b111e49565e081f07f93ea0d1e83d96d9dbf2fcce2664fb718a09c638e470643bf6e44368c8bcab297f65513d1288a76aa64451cd29c38b"

RPROVIDES:${PN} += "rpm-/usr/lib64/rpm-plugins/ima.so \
rpm-plugin-ima"

RDEPENDS:${PN} += "rpm"

inherit rpm
