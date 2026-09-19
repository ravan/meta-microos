SUMMARY = "Tool for creating custom document fingerprints"
DESCRIPTION = "The libexttextcat-tools package contains the createfp program that allows \
you to easily create your own document fingerprints."
LICENSE = "BSD-4-Clause"

PV = "3.4.7"

RPM_NAME = "libexttextcat-tools-3.4.7-2.9.aarch64.rpm"
RPM_HASH = "189e21ded6d57bc9243b9046b0d77e6132e6a71ba9a99812f30d1077dd90232e1a5c78d505dd145beeb4da6f970ebafd394b8c2cee42121ce21e2051b460b455"

RPROVIDES:${PN} += "libexttextcat-tools"

RDEPENDS:${PN} += "libc.so.6 \
libexttextcat-2.0.so.0"

inherit rpm
