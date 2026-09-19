SUMMARY = "Development files for OpenImageDenoise"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for OpenImageDenoise. If you would like to develop programs using OpenImageDenoise, \
you will need to install OpenImageDenoise-devel."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "OpenImageDenoise-devel-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "3018843ee879b443447e1f32da3f20d20559f444272cd9c1bd2e9ff9f764d1f92b282c650fc52335a0537df85002620a039ab9326b53a0897eaca80ed57eb462"

RPROVIDES:${PN} += "OpenImageDenoise-devel \
cmake-OpenImageDenoise"

RDEPENDS:${PN} += "libOpenImageDenoise2"

inherit rpm
