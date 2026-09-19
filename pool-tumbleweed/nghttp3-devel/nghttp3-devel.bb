SUMMARY = "Development files for nghttp3"
DESCRIPTION = "Development files for usage with libnghttp3, which implements \
Hypertext Transfer Protocol version 3."
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "nghttp3-devel-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "cef3f262758e89c979ba36aad8e158007100a8cdb6e0a11b7b2dcfe751b65e0d056235bafee14f594232baa31c2ff0aaaadf009e04c5f42fd5b463cba4550cff"

RPROVIDES:${PN} += "libnghttp3-devel \
nghttp3-devel \
pkgconfig-libnghttp3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnghttp3-9"

inherit rpm
