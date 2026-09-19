SUMMARY = "The system GNU Compiler locale files"
DESCRIPTION = "The system GNU Compiler locale files."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-locale-16-1.1.aarch64.rpm"
RPM_HASH = "a4b24439cb43e9eafb810e0cb569fd0fd0439e41fc38bda588e8cf10e40ddf8d57b3db9e04770079833425bf4310c8cbe139882b79ccd5e0aec294dafcb7f668"

RPROVIDES:${PN} += "gcc-locale"

RDEPENDS:${PN} += "gcc16-locale"

inherit rpm
