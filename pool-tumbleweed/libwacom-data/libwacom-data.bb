SUMMARY = "Data files for libwacom, a table identification library"
DESCRIPTION = "libwacom is a library to identify graphics tablets and their model-specific \
features. It provides access to information such as 'is this a built-in \
on-screen tablet', 'what is the size of this model', etc."
LICENSE = "HPND"

PV = "2.19.1"

RPM_NAME = "libwacom-data-2.19.1-1.1.aarch64.rpm"
RPM_HASH = "48481e5b71c67b849dfc499e1012453a911ad8ba76bf9ea32f74e85bac0563b072b70af7000c831dad8236572f2e2ce3929ade804f3db9f4ce069c7cf6de2dbb"

RPROVIDES:${PN} += "libwacom-data"

RDEPENDS:${PN} += ""

inherit rpm
