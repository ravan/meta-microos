SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-xmlwriter-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "b07fb863457a900588ff8e465cbf10240e510d4003ee77d707bbf01e2dcda4ab85a9c2022005fd2f7bb8ffa7a18933cb02b5b9e6c08b6fb95fc75412884d4363"

RPROVIDES:${PN} += "config-php8-xmlwriter \
php-xmlwriter \
php8-xmlwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
php"

inherit rpm
