SUMMARY = "PHP bindings for the Thrift software framework"
DESCRIPTION = "PHP bindings for the Thrift software framework: the Thrift\\ class \
library, installed on PHP's include path, together with the \
thrift_protocol extension that accelerates binary (de)serialization."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "php8-thrift-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "ec9f2023bd75885e5bf87c0465af1bbd81482531837e6eb2cbe08b5dbec0c6f6bc398bbcebc8069e4021b16318df6a1c38d2ce92f75b37572a7ac57ff3ffd53c"

RPROVIDES:${PN} += "config-php8-thrift \
php-thrift \
php8-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
php-api \
php-zend-abi"

inherit rpm
