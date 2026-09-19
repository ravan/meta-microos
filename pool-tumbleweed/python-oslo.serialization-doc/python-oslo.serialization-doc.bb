SUMMARY = "Documentation for OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.11.0"

RPM_NAME = "python-oslo.serialization-doc-5.11.0-1.1.noarch.rpm"
RPM_HASH = "434aa61432f1ff383def9f1aef0d9fa45576c6cb32604c9b1029a6cae73a3ad28e79bfb0b83cdffb9b008390b9e43185f59607008a512054939f24c2892b2c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.serialization-doc"

RDEPENDS:${PN} += ""

inherit rpm
