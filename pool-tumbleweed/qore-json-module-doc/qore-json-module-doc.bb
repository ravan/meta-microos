SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
json module."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "qore-json-module-doc-1.9.0-1.5.noarch.rpm"
RPM_HASH = "4e6111cbc3cff031579e98e4ef329f91af6b72640ce404e951a32fcff75dd3317ea6e3797347a44bda1a84769048dec9607cb1f8a17cda6c428e5d2eb1cd44cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-json-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
