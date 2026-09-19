SUMMARY = "Manual for nanoxml"
DESCRIPTION = "Documentation for nanoxml, a small non-validating XML parser."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-2.2.3-6.10.noarch.rpm"
RPM_HASH = "fb3c7b71ace85c6486861de6708a417b3e02f797a192ceee608f248173d74d0a29e138f92f3dd891a46e2526b6b82c615d721620bfdb11a0ce0516ac31e8fa46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual"

RDEPENDS:${PN} += ""

inherit rpm
