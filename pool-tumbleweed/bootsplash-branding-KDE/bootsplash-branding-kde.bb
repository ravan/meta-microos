SUMMARY = "KDE Bootsplash Theme"
DESCRIPTION = "This package contains a KDE branded theme."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "bootsplash-branding-KDE-3.3-13.23.noarch.rpm"
RPM_HASH = "c71433d90585ec3b3d06d48ddea8b4a2121c0c41533acbe2396d660c6ce743c8bcd2c5b36ea2c491a6efea4f313a04ecb4b33abebb7d8c54acdaeb64b584a870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootsplash-branding \
bootsplash-branding-KDE \
config-bootsplash-branding-KDE"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bootsplash \
fillup \
perl"

inherit rpm
