SUMMARY = "Libyui - REST API header files"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
This is a development subpackage."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-rest-api-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "57fafa305999f920b2a4cd8462562e0e59658be29df607dfd4d49868fb51dad35a20fd1c50998052e19f11881793dc1af1eb22f2632ea425dc594bbede81637b"

RPROVIDES:${PN} += "libyui-rest-api-devel"

RDEPENDS:${PN} += "boost-devel \
glibc-devel \
jsoncpp-devel \
libmicrohttpd-devel \
libstdc++-devel \
libyui-devel \
libyui-rest-api16"

inherit rpm
