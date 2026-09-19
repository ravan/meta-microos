SUMMARY = "Libyui-ncurses-pkg header files"
DESCRIPTION = " \
This package contains the header files for the NCurses (text based) \
package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-pkg-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "e006a8f72fe8697da1c7b48aedc4e9e705b3158bc6d8f4e2090c3e9e9a9a82be09b6489bc34ad8cb526161dbe6c0fd8f24339a94b401d8f840337db224fdc7ce"

RPROVIDES:${PN} += "libyui-ncurses-pkg-devel"

RDEPENDS:${PN} += "boost-devel \
glibc-devel \
libstdc++-devel \
libyui-ncurses-devel \
libyui-ncurses-pkg16 \
libzypp-devel"

inherit rpm
