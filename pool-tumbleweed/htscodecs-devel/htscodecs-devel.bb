SUMMARY = "Header files and libraries for compiling against htscodecs"
DESCRIPTION = "Header files and libraries of the samtools project for compiling against htscodecs."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "htscodecs-devel-1.6.1-1.5.aarch64.rpm"
RPM_HASH = "cd4ad428db00804fe5f4cc8881b3c81822d4afa29de29d491b5f99f2a56283e075082e75817585b8034ff653a4ff4575e22d2c67e9d309170d8e3378f9849919"

RPROVIDES:${PN} += "htscodecs-devel"

RDEPENDS:${PN} += "libhtscodecs2"

inherit rpm
