SUMMARY = "The COLLADA Document Object Model (DOM) runtime C++ Library Development files"
DESCRIPTION = "The COLLADA Document Object Model (DOM) runtime C++ Library Development files \
 \
The COLLADA Document Object Model (DOM) is an application programming \
interface (API) that provides a C++ object representation of a COLLADA XML \
instance document."
LICENSE = "MIT"

PV = "2.5.1+git20200104.c1e20b7"

RPM_NAME = "collada-dom-devel-2.5.1+git20200104.c1e20b7-5.1.aarch64.rpm"
RPM_HASH = "715ddfac0944becae08d8120bcc2ddc43185954e6d20d7ebb42d6adbaf339a690d4f7be3910737c1aad44ff62a67ca4ed1a30a5e0523f66b307b9b4d47fc2968"

RPROVIDES:${PN} += "cmake-collada-dom \
collada-dom-devel \
pkgconfig-collada-dom \
pkgconfig-collada-dom-141 \
pkgconfig-collada-dom-150"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcollada-dom2-5-dp0"

inherit rpm
