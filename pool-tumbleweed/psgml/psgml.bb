SUMMARY = "Emacs Add-On to edit SGML/XML documents"
DESCRIPTION = "'psgml' supports you while editing SGML/XML documents.	It respects the \
context of the used DTD (Document Type Definition) and offers the valid \
elements and attributes. \
 \
Included are several helper tools: tdtd, xxml, psgml-xpointer. \
 \
For more info see README.openSUSE. \
 \
Compiled for GNU Emacs (XEmacs has its own version!)."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.4.1"

RPM_NAME = "psgml-1.4.1-7.8.noarch.rpm"
RPM_HASH = "c7b73148e0b0e6ae5e0c6d69b0063fc2461d11894050ac9ceef003ad306a4df6fbe5c757d8a909509e9b8618c5ea4fc406dc248420e9ab433f1dda0b747c13c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psgml"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs-program"

inherit rpm
