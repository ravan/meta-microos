SUMMARY = "PHP Coding Standards Fixer"
DESCRIPTION = "The PHP Coding Standards Fixer (PHP CS Fixer) tool fixes code to \
follow standards; this can be the PHP coding standards as defined \
in the PSR-1, PSR-2, etc., or other community driven ones like the \
Symfony one. Custom styles can also be defined through \
configuration."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "php-cs-fixer-3.13.0-1.10.noarch.rpm"
RPM_HASH = "876ef48e637c1e9e14bc5e69b5f6f6846113e9e1c0392daa29bc27b3fe45758819055f7479b84596d4683b2bd69da80560a44d89bbbd45aed0c2576a32fb6ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-cs-fixer"

RDEPENDS:${PN} += "php8-iconv \
php8-phar \
php8-tokenizer"

inherit rpm
