SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-2.5.1-31.4.noarch.rpm"
RPM_HASH = "b57a45af6083b2069c33ae906f6b02ab1a8c55b2577b81f9776ddf0f975e8101a5c683ef170e514236315fcc2b8da56fd12014b06567998f91ece951cdb2956c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2"

RDEPENDS:${PN} += "javapackages-tools"

inherit rpm
