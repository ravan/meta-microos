SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings to clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
python3-lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "python3-lldb-23-1.1.aarch64.rpm"
RPM_HASH = "87047387b00444b5b7ad044ea67b067ebd27c3076f43fab338d581c02352b56eb5f718cd5515aec1f04ca7ffebbe8f6e867d9b02d342167a4c0e651ee5f68576"

RPROVIDES:${PN} += "python3-lldb"

RDEPENDS:${PN} += "python3-lldb23"

inherit rpm
