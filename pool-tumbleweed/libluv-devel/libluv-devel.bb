SUMMARY = "Header files for luajit-luv"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of luajit-luv."
LICENSE = "Apache-2.0"

PV = "1.51.0+1"

RPM_NAME = "libluv-devel-1.51.0+1-7.3.aarch64.rpm"
RPM_HASH = "bff24ab991ae049a04de2db9fa3076a1905757acc50d2b86773040d94e1f9c3a3b08cd637b231657b33eb8e906b6f8478ae2c74f14c9301e295cb1cd03b9617f"

RPROVIDES:${PN} += "libluv-devel \
pkgconfig-libluv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluv1"

inherit rpm
