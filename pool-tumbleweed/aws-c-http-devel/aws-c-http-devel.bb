SUMMARY = "Development files for aws-c-http library"
DESCRIPTION = "C99 implementation of the HTTP/1.1 and HTTP/2 specifications. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "aws-c-http-devel-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "0e5354b8ca84a1e724e22d1b7335f4cb25e5ba944fe3a2bb579c8c9e5ca92e5eee948e0eba32eec0076f508b54eb3e13a1d869e572ee4e872245315a8c43af41"

RPROVIDES:${PN} += "aws-c-http-devel \
cmake-aws-c-http"

RDEPENDS:${PN} += "libaws-c-http1-0-0"

inherit rpm
