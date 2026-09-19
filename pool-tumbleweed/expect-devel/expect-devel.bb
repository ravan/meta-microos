SUMMARY = "Header Files and C API Documentation for expect"
DESCRIPTION = "This package contains header files and documentation needed for linking \
to expect from programs written in compiled languages like C, C++, etc. \
 \
This package is not needed for developing scripts that run under the \
/usr/bin/expect interpreter, or any other Tcl interpreter with the \
expect package loaded."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-devel-5.45.4-8.5.aarch64.rpm"
RPM_HASH = "d25996ef84b3d419262f84a5769dcd7d07f6955a3c7d7c16ba0444c5034388006b3ac91505a3b470f386fdff02ac90a61450cd3be54597f5a88aec7210b79c3f"

RPROVIDES:${PN} += "expect-devel"

RDEPENDS:${PN} += ""

inherit rpm
