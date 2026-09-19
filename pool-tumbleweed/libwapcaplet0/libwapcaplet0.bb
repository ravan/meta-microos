SUMMARY = "A string internment library"
DESCRIPTION = "LibWapcaplet is a string internment library, written in C. It provides \
reference counted string interment and rapid string comparison \
functionality. It was developed as part of the NetSurf project and is \
available for use by other software under the MIT licence. For further \
details, see the readme."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "libwapcaplet0-0.4.3-2.18.aarch64.rpm"
RPM_HASH = "7fe251f0f968edd0ed6552482b8359d07d1234008bdc6a4c09ec2a24803a005b5ff51fcd85abe82b080b25da0b5658d23c3fcca51676f7a5b5b7768a75b1e38a"

RPROVIDES:${PN} += "libwapcaplet.so.0 \
libwapcaplet0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
