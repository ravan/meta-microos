SUMMARY = "Metapackage, requires R-core-devel, R-core-libs"
DESCRIPTION = "Metapackage to keep the same user experience as before the split of \
the monolithic R-base-devel"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-base-devel-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "9b053cbeb804d813e1a979b084497f3c8439e03e3edb46576f7ea545e4b84e25baf2787e5b610e66105f4dcf4a9a637328673e6c9b09bcea4b80f5599d6dadc5"

RPROVIDES:${PN} += "R-base-devel"

RDEPENDS:${PN} += "R-core-devel \
R-core-libs"

inherit rpm
