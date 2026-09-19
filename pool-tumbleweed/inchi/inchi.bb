SUMMARY = "The IUPAC International Chemical Identifier"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the command line conversion utility."
LICENSE = "MIT"

PV = "1.07.5"

RPM_NAME = "inchi-1.07.5-1.4.aarch64.rpm"
RPM_HASH = "b520cb8b9c65f33ec9109908f72e53d36d82d478160ceaf720d60cf4ed7d2592887cece0302885ad4a4c11b9042dfe1266d6fe81fecb27cf3fc412a29093bb40"

RPROVIDES:${PN} += "inchi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
