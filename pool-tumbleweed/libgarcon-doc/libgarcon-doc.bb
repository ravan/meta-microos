SUMMARY = "Documentation for garcon"
DESCRIPTION = "This package includes the documentation for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-doc-4.20.0-1.8.noarch.rpm"
RPM_HASH = "21dbb9cf552ee4473192a33ba21ab556ab58eba8348e589ac1bedd1d1159115c51460fd13d954aa579fd4e1c70910a53df8733f08e1fea894cf2cc73dee7261a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-doc"

RDEPENDS:${PN} += ""

inherit rpm
