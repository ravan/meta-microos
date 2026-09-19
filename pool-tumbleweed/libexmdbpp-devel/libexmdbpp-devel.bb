SUMMARY = "Development files for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains the header files for the library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "libexmdbpp-devel-1.11.0.58baa16-2.7.aarch64.rpm"
RPM_HASH = "1b2c435a21fc84ff423835155c7837e5b15acb8ecaf4154cf698d4a01aa984aad0f0093ff2a17ec24cc7624dc958d7cd570f443425236b306f015aa4d2ccba13"

RPROVIDES:${PN} += "libexmdbpp-devel"

RDEPENDS:${PN} += "libexmdbpp0"

inherit rpm
