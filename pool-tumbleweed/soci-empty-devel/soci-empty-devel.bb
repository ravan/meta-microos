SUMMARY = "Development files for the soci empty back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-empty-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "678c0f50f410cd6255f3b69ddd495f8e1309902bf92c6dfa851d191c0459d56966c1a546a5c36961a4f414e86086467f8c2bcc24b0d4a688f8b847ff995303e0"

RPROVIDES:${PN} += "soci-empty-devel"

RDEPENDS:${PN} += "libsoci-empty4-0 \
soci-devel"

inherit rpm
