SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "2.0.0.1"

RPM_NAME = "libb64-1-2.0.0.1-1.3.aarch64.rpm"
RPM_HASH = "a8b1a567662544f73eca00adf4bc5088428c8c3fc60c0b3ffc376fcc40309aa0360ef8cfb580b69b9c9a5f145ae156689f81788639bf0e87ca87354cfee960a6"

RPROVIDES:${PN} += "libb64-1 \
libb64.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
