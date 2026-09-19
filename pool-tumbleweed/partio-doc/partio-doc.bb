SUMMARY = "Documentation files for partio"
DESCRIPTION = "The partio-doc contains documentastion for the library."
LICENSE = "BSD-3-Clause"

PV = "1.20.0"

RPM_NAME = "partio-doc-1.20.0-1.4.noarch.rpm"
RPM_HASH = "1efe2895daa2482ab9a32ca32e37705d8714a769f02644327b50627abf63bfd472e88cf77394dc7361e3e8b9c19275f95c672b2ecded06ba81b2330fae0eefdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "partio-doc"

RDEPENDS:${PN} += "partio"

inherit rpm
