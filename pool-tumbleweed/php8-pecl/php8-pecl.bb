SUMMARY = "PHP Extension Community Library"
DESCRIPTION = "PECL is a repository for PHP Extensions, providing a directory of \
all known extensions and hosting facilities for downloading and \
development of PHP extensions. \
 \
See https://pecl.php.net for more details."
LICENSE = "BSD-2-Clause"

PV = "1.10.26"

RPM_NAME = "php8-pecl-1.10.26-1.3.noarch.rpm"
RPM_HASH = "2bf544e6d8498366b01413ad0ac7eb256b9f6168f09380937a5ec5b85049125f71cf2c2732d8f1a844b363b986a3b8bc5ec0aab39e917644d2768595aae3f79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pecl \
php8-pecl"

RDEPENDS:${PN} += "/usr/bin/sh \
autoconf \
automake \
gcc-c++ \
libtool \
php8-pear"

inherit rpm
