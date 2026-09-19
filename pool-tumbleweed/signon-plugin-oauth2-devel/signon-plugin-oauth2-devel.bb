SUMMARY = "Development files for signon-plugin-oauth2"
DESCRIPTION = "This package contains the development files for the Oauth2 plugin for the Single \
Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "0.25git.20231124T142245~fab6988"

RPM_NAME = "signon-plugin-oauth2-devel-0.25git.20231124T142245~fab6988-1.9.aarch64.rpm"
RPM_HASH = "95e980481d20aafc4709681d2f1357cb32a42ccaf7bae49097fa9e8a72d75add6ae035c5685481b62a265abf81617e8bbe9bdafdcde567128ed57f40e20ea6a8"

RPROVIDES:${PN} += "pkgconfig-signon-oauth2plugin \
signon-plugin-oauth2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-signon-plugins \
signon-plugin-oauth2"

inherit rpm
