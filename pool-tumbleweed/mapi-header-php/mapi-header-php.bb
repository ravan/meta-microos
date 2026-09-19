SUMMARY = "Common PHP MAPI header files for grommunio"
DESCRIPTION = "PHP files shared between grommunio-web, grommunio-sync and other PHP \
applications from the groupware suite."
LICENSE = "AGPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "mapi-header-php-2.1-1.3.noarch.rpm"
RPM_HASH = "e161413a9a2bcbe2e84a2f853ae6b16f6f43588d7c610cfa4d50a60e5a01edeb676e3d08708d4e6d996062fbdbbf6b059b4244af0f1b8b8adcf9dd4f00c36b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mapi-header-php"

RDEPENDS:${PN} += ""

inherit rpm
