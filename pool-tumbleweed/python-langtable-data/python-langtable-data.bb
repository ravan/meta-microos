SUMMARY = "XML data to map various locale settingsn and its relations"
DESCRIPTION = "Provides XML data used by python-langtable. Packaged separately so it is not affected \
by more python target versions and also it can be used indenpendently."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.71"

RPM_NAME = "python-langtable-data-0.0.71-2.1.noarch.rpm"
RPM_HASH = "8e03ebdac4a118f5b95222e4bc028c6dda577723618f0427a7c9d10666f817e83d6fcbe4138da8def27ba6590d1655e1409aaab6d77033ea1b4b8a90726291d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-langtable-data"

RDEPENDS:${PN} += ""

inherit rpm
