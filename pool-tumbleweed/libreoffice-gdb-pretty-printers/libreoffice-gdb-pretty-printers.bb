SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-gdb-pretty-printers-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "140be477626d0e9a6a11383310eb2d9b87abc947e7d62ac99c14dd2356938cd8ac6669b0b476b9ac9ed797a07602c5d7ff374d213b9b1037373d59affb17aaff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"

RDEPENDS:${PN} += "gdb \
libreoffice \
python3-six"

inherit rpm
