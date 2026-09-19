SUMMARY = "RADOS block device headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS block device."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librbd-devel-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "b32cc3da06d0ad82e95ae712ca98fd62d129051ad1bbac66bdee45a3bd363249ae41788b9a5ef57a46f8e3c7acd29adfd448943401161c483bbccf4b29fe889c"

RPROVIDES:${PN} += "librbd-devel \
librbd1-devel"

RDEPENDS:${PN} += "librados-devel \
libradospp-devel \
librbd1"

inherit rpm
