SUMMARY = "APCu - APC User Cache"
DESCRIPTION = "APCu is userland caching: APC stripped of opcode caching in preparation \
for the deployment of Zend Optimizer+ as the primary solution to opcode \
caching in future versions of PHP."
LICENSE = "PHP-3.01"

PV = "5.1.28"

RPM_NAME = "php8-APCu-5.1.28-1.5.aarch64.rpm"
RPM_HASH = "ceb90737e73beeb2eb8586d70acccc3eaae1fcc8584c8ad3aed16a991807df2aa0b3e0c96516daa26dff1a6319c01885b5cfe2219ae9f7f5366f936af97925a2"

RPROVIDES:${PN} += "config-php8-APCu \
php-APCu \
php8-APCu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
