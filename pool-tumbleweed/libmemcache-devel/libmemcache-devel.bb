SUMMARY = "Development files for libmemcache"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package contains the development files for libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache-devel-1.4.0.rc2-153.9.aarch64.rpm"
RPM_HASH = "3c1137324cb7e18b4f014334d41289c064c9be594b35556e38652c49fe6a8f90ed059e4b4f503c36fc820f74f2540ba5588027097abbd81f260580ace1f56f76"

RPROVIDES:${PN} += "libmemcache-devel"

RDEPENDS:${PN} += "libmemcache0"

inherit rpm
