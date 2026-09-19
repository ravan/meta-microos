SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.2.0901"

RPM_NAME = "vim-data-9.2.0901-1.1.noarch.rpm"
RPM_HASH = "99a24dcb58612df5624e74ffd1f13da6e9c3ae5c7e91a72c8e35691bb5ef1908373f41c09b32cea0858f303cf769b3125702f22a7e01f582432309aa94bcb6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data \
vim-plugin-matchit \
vim-plugin-nginx"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
vim-data-common"

inherit rpm
