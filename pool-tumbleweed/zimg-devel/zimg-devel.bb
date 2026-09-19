SUMMARY = "Development files for libzimg2"
DESCRIPTION = "The libzimg-devel package contains libraries and header files for \
developing applications that use libzimg2."
LICENSE = "WTFPL"

PV = "3.0.6+20260720.g1ad1895"

RPM_NAME = "zimg-devel-3.0.6+20260720.g1ad1895-1.1.aarch64.rpm"
RPM_HASH = "fc227cb741594a8e7467b04956736d5898714800189763edb95f131d6a4e8ba39f809548e3debdd8e25c18997a68593f803a0c3b606b14a614b84fbf195074c4"

RPROVIDES:${PN} += "pkgconfig-zimg \
zimg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzimg2"

inherit rpm
