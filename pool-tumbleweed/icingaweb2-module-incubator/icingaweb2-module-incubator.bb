SUMMARY = "Bleeding edge Icinga Web 2 libraries"
DESCRIPTION = "Icinga Web 2 - ReactPHP-based 3rd party libraries"
LICENSE = "MIT"

PV = "0.23.0"

RPM_NAME = "icingaweb2-module-incubator-0.23.0-1.4.noarch.rpm"
RPM_HASH = "b9978802cd26b1a1fdc64e653b16ed00625cf82cff49f742f41b099f392c4cde2c44acfe42fef410b7b08a291cc79ea79686e7ee2bcad49ac85780ac44b9de86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-incubator"

RDEPENDS:${PN} += "icinga-php-library \
icinga-php-thirdparty \
php \
php-ctype"

inherit rpm
