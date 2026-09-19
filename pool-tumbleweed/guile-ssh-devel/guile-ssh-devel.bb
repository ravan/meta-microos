SUMMARY = "Development files for Guile-SSH"
DESCRIPTION = "The libraries and header files for developing applications that use guile-ssh."
LICENSE = "GPL-3.0-or-later"

PV = "0.18.0"

RPM_NAME = "guile-ssh-devel-0.18.0-1.8.aarch64.rpm"
RPM_HASH = "20d4daa54235571317e1ec4e2bfcf4d67689cdbcecb4982c764edb9fd806002c6ede939f22168237b0f8cc2c4a1a48a27640dd5b64833778f4fff054a6532c35"

RPROVIDES:${PN} += "guile-ssh-devel"

RDEPENDS:${PN} += "/usr/bin/guile \
/usr/bin/sh \
libguile-ssh18"

inherit rpm
