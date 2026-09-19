SUMMARY = "Utilities to create a whatis database"
DESCRIPTION = "The man system in SUSE Linux (package man) does not need a whatis \
database. Nevertheless, some manual browsers, such as tkman, still need \
such a database."
LICENSE = "GPL-2.0-or-later"

PV = "2009.6.17"

RPM_NAME = "makewhat-2009.6.17-24.18.noarch.rpm"
RPM_HASH = "196562b517991b4f72d5ca59c29f8e8d54a537edc71d46d459f8cfaab1beb88cc13d0ee133d77484271bfdddc17c0c193d0b93a4505db5408800cc14234eaf41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-makewhat \
makewhat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
man \
update-alternatives"

inherit rpm
