SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM. \
 \
This package is a dummy package that depends on the version of \
libomp-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "libomp-devel-23-1.1.aarch64.rpm"
RPM_HASH = "7c2c9b42229009a8746ee4f0549a362914463c47e701067cce4370a67ef194915b0c267fa3a7f1ad838fcec7dc9ca582a58eac73988939f7db338772abed33c9"

RPROVIDES:${PN} += "libomp-devel"

RDEPENDS:${PN} += "libomp23-devel"

inherit rpm
