SUMMARY = "Development files for libmonosgen"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Development files for libmonosgen."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmonosgen-2_0-devel-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "73096f0619906f8316e017ae70a59b790b8e4dda736078d1fbafc3dc724456a89db7db3cb82dcda5ff747e4802a2be99ca75f8e5dd216c47db67f232b874fdab"

RPROVIDES:${PN} += "libmonosgen-2-0-devel \
pkgconfig-monosgen-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmono-2-0-devel \
libmonosgen-2-0-1 \
mono-core"

inherit rpm
