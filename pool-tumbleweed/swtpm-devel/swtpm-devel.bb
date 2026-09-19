SUMMARY = "Development files for swtpm"
DESCRIPTION = "The development files for SWTPM"
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "swtpm-devel-0.10.2-1.1.aarch64.rpm"
RPM_HASH = "bbd6de0fd7b65a549a3966cdb2315501c57660e4f5dff754c9d518cec27a282c4857d6531424d4fe64e3642d91a8037af10f28a9fc9e0e4041daa1a7a0bf9f8a"

RPROVIDES:${PN} += "swtpm-devel"

RDEPENDS:${PN} += "glib2-devel \
libopenssl-devel \
libseccomp-devel \
libtpms-devel \
swtpm"

inherit rpm
