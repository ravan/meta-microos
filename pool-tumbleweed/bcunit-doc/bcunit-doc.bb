SUMMARY = "BCUnit documentation"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit documentation files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4.102"

RPM_NAME = "bcunit-doc-5.4.102-1.3.aarch64.rpm"
RPM_HASH = "75e38b87dc80db544c03498d13444653f899dab0fc0d284b7cb415aad1796e080a206cebd10e4527af773f08ebc8263208e7bcc1231845f96c7cb4afe6f3cf83"

RPROVIDES:${PN} += "bcunit-doc"

RDEPENDS:${PN} += "libbcunit1"

inherit rpm
