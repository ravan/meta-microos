SUMMARY = "Development files for libtermkey, a keyboard entry processing library"
DESCRIPTION = "This library allows easy processing of keyboard entry from terminal-based \
programs. It handles all the necessary logic to recognise special keys, UTF-8 \
combining, and so on, with a simple interface."
LICENSE = "MIT"

PV = "0.22"

RPM_NAME = "libtermkey-devel-0.22-3.9.aarch64.rpm"
RPM_HASH = "7846b96ee00ffdd0483b41cd85b0800a085a6560042355864f5e7630b8ea3af10468bb948ccefb8a89a77d1cfa8881c11aa029bac452559b1852a47294e39992"

RPROVIDES:${PN} += "libtermkey-devel \
pkgconfig-termkey"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtermkey1 \
ncurses-devel \
pkgconfig"

inherit rpm
