SUMMARY = "Documentation for OpenStack concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "7.6.1"

RPM_NAME = "python-oslo.concurrency-doc-7.6.1-1.1.noarch.rpm"
RPM_HASH = "85571f1ef0cef2e83e0ba718ccbf0145af5a4d68ded026eafdd4bfbea6d5007d771df1ca3506b2a46445de924280ac6aa72ad7a1482559bf3d3272534f35697a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.concurrency-doc"

RDEPENDS:${PN} += ""

inherit rpm
