SUMMARY = "Tool to translate XML documents using PO files"
DESCRIPTION = "ITS Tool extracts messages from XML files and outputs PO template files, then \
merges translations from MO files to create translated XML files. It determines \
what to translate and how to chunk it into messages using the W3C \
Internationalization Tag Set (ITS)."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.7"

RPM_NAME = "itstool-2.0.7-4.2.noarch.rpm"
RPM_HASH = "593ab13f7e2cab783c49a265983938ed66e1c3b4cdbf4ce962b8f0f333ef40756385bc792f66f354395e45613dfa1710257ecda25cd5f6f2b2168eea72160870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itstool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-lxml"

inherit rpm
