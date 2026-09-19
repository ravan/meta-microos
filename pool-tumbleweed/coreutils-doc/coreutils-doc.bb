SUMMARY = "Documentation for the GNU Core Utilities"
DESCRIPTION = "This package contains the documentation for the GNU Core Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "9.11"

RPM_NAME = "coreutils-doc-9.11-5.1.noarch.rpm"
RPM_HASH = "92d5273c4c5e433c7807d7435d653dd89ff4c8e1c807de4468f9ddceaa32c6530c4486f900521d7525bfd79e30392517ba993e76a11493ed701c6e4a5f5d091a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-/usr/share/info/coreutils.info.gz \
coreutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
