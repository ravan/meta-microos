SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.5.10"

RPM_NAME = "php8-pcntl-8.5.10-1.1.aarch64.rpm"
RPM_HASH = "966caa6a506fb0557b1079c0374c7fadd84c576b3547527861f926924d3ddffda5900bf62695a2aaf6aab0fb12cb2ab6d493263c1782b0c3353105b35e60e033"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
