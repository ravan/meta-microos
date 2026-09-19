SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "Core files of Scheme48 without development environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "scheme48-vm-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "801da4af581a83ec41a3e45748cf45f4fa2b23c956c9441fdc9a23dc11c35656bbf20823fab78e3f757817274cedef7698d41684db2c52477aed6d0e910dd013"

RPROVIDES:${PN} += "scheme48-vm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
