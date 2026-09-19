SUMMARY = "Development files for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the development files for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "mxml-devel-3.3.1-1.13.aarch64.rpm"
RPM_HASH = "6c18bcf2635777568413a420189e6b6266a44047c7aa3a6a4bcf2279db443253fe58881515ed6eafe228c08b0bf5bae54986bae60d54615c7e2b2825a1f707a7"

RPROVIDES:${PN} += "mxml-devel \
pkgconfig-mxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmxml1"

inherit rpm
