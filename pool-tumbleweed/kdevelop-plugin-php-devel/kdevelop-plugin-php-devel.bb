SUMMARY = "Development package for kdevelop-plugin-php"
DESCRIPTION = "This package contains the development files needed in order to use the \
kdevelop-plugin-php API."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-plugin-php-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b701d78e4cc14b070098b2eb317f56137a0614e7c286959548dd62a4424b40a44fc26671c9ca5e97f8a76eec7ef8e6b8ba3a3092f10f92c2631451a4f5b1a34c"

RPROVIDES:${PN} += "cmake-KDevPHP \
kdevelop-plugin-php-devel"

RDEPENDS:${PN} += "kdevelop-plugin-php"

inherit rpm
