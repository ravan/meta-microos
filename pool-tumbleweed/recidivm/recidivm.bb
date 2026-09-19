SUMMARY = "Tool for estimating peak virtual memory use"
DESCRIPTION = "recidivm estimates the target program's peak virtual memory use by running it multiple times with different memory limits."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "recidivm-0.2.1-1.10.aarch64.rpm"
RPM_HASH = "886d599942e1780e2f77592693e287e9b4f03554295c6a5aef4805b4344b48c35a5fee9ee48d70f4be663f3e3e060861f651561cace1f91eff696758b481b6a5"

RPROVIDES:${PN} += "recidivm"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
