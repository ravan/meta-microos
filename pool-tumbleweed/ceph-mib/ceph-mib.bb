SUMMARY = "MIB for SNMP alerts"
DESCRIPTION = "This package provides a Ceph MIB for SNMP traps."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-mib-18.2.7-8.1.noarch.rpm"
RPM_HASH = "49edc97dfc4151ad6ad4fb8499fedb0b192c02f4bc71bc4886c2c5bf782b0456c3657c314ff7d18896a9736884ea57836b25e128b78bfeabd80f64c6fb8405c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mib"

RDEPENDS:${PN} += ""

inherit rpm
