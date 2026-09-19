SUMMARY = "Spanish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Spanish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-es-10.0.6-1.1.noarch.rpm"
RPM_HASH = "c7aba7fc76f98c923da1ede9e03c36702528f9b932630ffe0777002fb3624cdf4baf062ce23fc70a1337041c423f6bda9bbab4b4d549dbbe7d63f31c494a7b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-es \
locale-kicad-doc-es"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
