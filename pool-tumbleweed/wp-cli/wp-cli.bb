SUMMARY = "WordPress command-line interface"
DESCRIPTION = "WP-CLI is the command-line interface for WordPress. You can update plugins, \
configure multisite installations and much more, without using a web browser."
LICENSE = "MIT"

PV = "2.12.0"

RPM_NAME = "wp-cli-2.12.0-1.4.noarch.rpm"
RPM_HASH = "00e3fdc7e79d3bb2e29d92a29bce3d3bb83fdd76aa68b3a77aca1daed8f7901e177d1e57a87133fa68377eac2900818c5f78d4dd2c52d2085cba8a602cd209e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wp-cli \
wp-cli"

RDEPENDS:${PN} += "php \
php-json \
php-openssl \
php-phar \
php-zip"

inherit rpm
