SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-xmlreader-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "ebc4b218254bb3abeec7f5dc665fc56a859ac849aab15c9fb1f3f8e616d5c38a156bd9a59d11e9a631ab8e4f597ac0849b58a09517cecb962c5b599ccb8379bd"

RPROVIDES:${PN} += "config-php8-xmlreader \
php-xmlreader \
php8-xmlreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
php \
php-dom"

inherit rpm
