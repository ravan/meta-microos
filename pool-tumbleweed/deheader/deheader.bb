SUMMARY = "Find and optionally remove unneeded includes in C or C++ sourcefiles"
DESCRIPTION = "deheader analyzes C and C++ files to determine which header inclusions can be \
removed while still allowing them to compile. This may result in substantial \
improvements in compilation time, especially on large C++ projects; it also \
sometimes exposes dependencies and cohesions of which developers were unaware."
LICENSE = "BSD-2-Clause"

PV = "1.11"

RPM_NAME = "deheader-1.11-1.3.noarch.rpm"
RPM_HASH = "2d5a649be4c7879ce49194a906f1b8679bba05860d5a00db5b3dbd80a26b1e6126f828d5b5f2c8f11c4da924137bf197d2733c9be20579796dfc3150f4cfd643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deheader"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
