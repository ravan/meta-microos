SUMMARY = "API documentation for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
 \
This package provides the API documentation for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.4"

RPM_NAME = "openjpeg2-devel-doc-2.5.4-2.6.noarch.rpm"
RPM_HASH = "5732d84a405f6002cf055a0a42944fbfab1b12f6065dd5e959ef6692900305658759906ba6747eb48ba42d930a183334bdedf0ce1ce9f745b4acb8503f513e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openjpeg2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
