SUMMARY = "Documentation for kaddressbook"
DESCRIPTION = "This package includes the user guide for KAddressbook in HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kaddressbook-doc-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1bc85f7df96186ba11aa4fb7c4a83106d6fe285c975b7fd3531bc50c4c6a488ffcda8631a09d0b63ce0896bf786a84cbd33b7b9f2acbe3fff6a8629492c96b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
