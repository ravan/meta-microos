SUMMARY = "PHP Extension for Graphviz"
DESCRIPTION = "The graphviz-php package contains the PHP extension for the graphviz \
tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-php-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "2bfda9e11e36d76580ea7a52de10b838f63c2868faeae46c5c486bef9b429a06f9c4b8efd472712bff359aa2f918d49a9667977901bffeecf5e3f23c45e27244"

RPROVIDES:${PN} += "config-graphviz-php \
graphviz-php \
libgv-php.so"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libstdc++.so.6 \
php-api \
php-zend-abi \
php8"

inherit rpm
