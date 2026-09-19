SUMMARY = "Development files for libmono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Development files for libmono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmono-2_0-devel-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "911fd5e718c4ba214dd1d065bc4ca251972b4ffb9783138bee4b89b6dabfd3e848e7000b1d1c490d70a4668cc7f84946b78e9f3f2b3452f62721b46a8e210a83"

RPROVIDES:${PN} += "libmono-2-0-devel \
pkgconfig-mono-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-1 \
libmonosgen-2-0-devel \
mono-core"

inherit rpm
