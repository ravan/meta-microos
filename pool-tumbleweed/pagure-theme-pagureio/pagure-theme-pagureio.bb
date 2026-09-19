SUMMARY = "Pagure web interface theme used on Pagure.io"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as Pagure.io."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-pagureio-5.14.1-3.3.noarch.rpm"
RPM_HASH = "fee476ab3644f6be9e66f52fb0082149f27e4cc9adefca96e0307ca95ed22a60d632fe4c88a844f451bad3c9116fe78affb76e412808f322cbe41b10c82091bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-pagureio"

RDEPENDS:${PN} += "pagure"

inherit rpm
