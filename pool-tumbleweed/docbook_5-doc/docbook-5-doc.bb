SUMMARY = "Documentation for docbook_5"
DESCRIPTION = "The documentation for the DocBook 5.x specification (5.0 5.1 5.2CR5)"
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "5.2cr5"

RPM_NAME = "docbook_5-doc-5.2cr5-3.7.noarch.rpm"
RPM_HASH = "f332e7aaf2ffb57e87775042cf6712d7f405f57c71a03465ce1f9252dab1db1747a5e6e6f4a814c5d8afd02c320faad4194458a2fbe19911705dc5dcb241854c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-5-doc"

RDEPENDS:${PN} += ""

inherit rpm
