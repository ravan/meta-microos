SUMMARY = "Development files for libyang"
DESCRIPTION = "Libyang implements functions to process schemas expressed in the \
YANG data modeling language defined by the IETF in RFCs 6020/7950. \
Schemas expressed in this language primarily describe configuration \
used by larger network equipment like routers and switches. \
 \
In addition to handling the schemas itself, the library also provides \
functions to process data described by the schemas. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libyang."
LICENSE = "BSD-3-Clause"

PV = "3.13.6"

RPM_NAME = "libyang-devel-3.13.6-3.3.aarch64.rpm"
RPM_HASH = "2dfd8665a7cd594ccf9e7fe2fff4393c145e7a7dec3cb37f4486eaa6bceb5b87a3dceba4fdb7a96c3a6f9fdc40ef4c25149ae58c15ae9371194a09be21cd086c"

RPROVIDES:${PN} += "libyang-devel \
pkgconfig-libyang"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyang3 \
pkgconfig-libpcre2-8"

inherit rpm
