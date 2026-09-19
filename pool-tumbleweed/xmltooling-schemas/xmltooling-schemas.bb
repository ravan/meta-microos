SUMMARY = "XMLTooling schemas and catalog"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "xmltooling-schemas-3.3.0-1.9.noarch.rpm"
RPM_HASH = "a5b6a10866d55ad8277baff80a4cb1e4f130d5f6d9d99810a7ba0f7f6832bebab09f1432cd161ee5533e4848269db4cd8235196880e7ba77527044ab9f68c985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmltooling-schemas"

RDEPENDS:${PN} += ""

inherit rpm
