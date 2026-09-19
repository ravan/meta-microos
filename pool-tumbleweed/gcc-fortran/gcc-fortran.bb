SUMMARY = "The system GNU Fortran Compiler"
DESCRIPTION = "The system GNU Fortran Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-fortran-16-1.1.aarch64.rpm"
RPM_HASH = "079f7b1a31ec3498a4cb174cd90eb48d9db4a79534a127516f2d9fd649124f561868406d555973098e2c3b83a031ed9ae765c7950b273de97a9255ae9c0f7aab"

RPROVIDES:${PN} += "gcc-fortran"

RDEPENDS:${PN} += "gcc \
gcc16-fortran"

inherit rpm
