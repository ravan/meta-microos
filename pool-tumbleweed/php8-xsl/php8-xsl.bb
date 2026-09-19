SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-xsl-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "fa366eb96f2eb82c3490c301de10f9b6a38bfdaf0f252507b3699468fea5ad01fdcc67aece296e637e44d434cb1662491a4c44b3de7fe386bfcc8f2cce84364b"

RPROVIDES:${PN} += "config-php8-xsl \
php-xsl \
php8-xsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libxml2.so.16 \
libxslt.so.1 \
php \
php-dom"

inherit rpm
