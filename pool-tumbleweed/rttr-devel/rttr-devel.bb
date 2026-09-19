SUMMARY = "Header files for the C++ Run Time Type Reflection library"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-0.9.6-6.5.aarch64.rpm"
RPM_HASH = "7678a1169bb98d81c3286a3cb43e6fa9dacd018aa83e3de4954124f1f283893e45e1feebd1bc96c4a550cdbe8f8b024cc771fce00800bc17a48334ad2cbbfd15"

RPROVIDES:${PN} += "cmake-rttr \
rttr-devel"

RDEPENDS:${PN} += "librttr-core0-9-6"

inherit rpm
