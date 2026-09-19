SUMMARY = "Ukrainian (українська) Dictionary for Aspell"
DESCRIPTION = "An Ukrainian (українська) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aspell-uk-1.4.0-4.7.aarch64.rpm"
RPM_HASH = "50d7f09a807aa4c758fe3e67435c16d7823096b4d817b2a58044d92d26ff1582fd5f14d15260786a27e662aebbc853c18fd6a22db6074a8218c9f477d802bec4"

RPROVIDES:${PN} += "aspell-uk \
locale-aspell-uk"

RDEPENDS:${PN} += ""

inherit rpm
