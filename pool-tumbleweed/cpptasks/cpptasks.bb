SUMMARY = "Compile and link task"
DESCRIPTION = "This ant task can compile various source languages and produce \
executables, shared libraries and static libraries. Compiler adaptors \
are currently available for several C/C++ compilers, FORTRAN, \
MIDL and Windows Resource files."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-1.0b5-7.26.noarch.rpm"
RPM_HASH = "af200a1b3628a0a965c0859b26b7d7fa898a4f4dc430231f69b5c0f875a661b921b91eb4bb6df50b2c70317041ebf22bb8294d62bc60954e96477216be239293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-cpptasks \
cpptasks"

RDEPENDS:${PN} += "ant \
java"

inherit rpm
