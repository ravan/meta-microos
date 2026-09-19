SUMMARY = "Definition of SLE products for the Agama installer."
DESCRIPTION = "SLE-based products definition for Agama installer. \
Definition of SLE-based products (e.g., SUSE Linux Enterprise Server) for the Agama installer."
LICENSE = "GPL-2.0-only"

PV = "24+0.a836cced5"

RPM_NAME = "agama-products-sle-24+0.a836cced5-39.1.noarch.rpm"
RPM_HASH = "6cdefd5ce5a71d0afae0ddfd4c2b70d42bf12e1ee47d8258a1dec96aaa9515d162b812db31904e556f26257c97283b97688b0a983534c97ee0da6c06f2bff281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-products-sle"

RDEPENDS:${PN} += ""

inherit rpm
