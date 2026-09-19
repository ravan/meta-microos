SUMMARY = "Documentation files"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes the json-c documentation."
LICENSE = "MIT"

PV = "0.19"

RPM_NAME = "json-c-doc-0.19-1.2.noarch.rpm"
RPM_HASH = "00256b92acb1e45b71118428eef46358a6ef917ebb95c35b85f6f2e89e00140b95d0e7df0da910c9508e0a82716fa5e8df636c78fe56ee9ed3c46e299308e967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-c-doc \
libjson-c-doc \
libjson-doc"

RDEPENDS:${PN} += ""

inherit rpm
