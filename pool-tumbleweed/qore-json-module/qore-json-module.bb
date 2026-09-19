SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the json module for the Qore Programming Language. \
 \
JSON is a concise human-readable data serialization format."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "qore-json-module-1.9.0-1.5.aarch64.rpm"
RPM_HASH = "3a1fc30173e766bf40b9d1bcc61cea5512ce87e663f02f792afecd5b81c4f1594c46799b0bab378995a0f122da5b70c3a7df0946c7e982ca3c130214ae8ec338"

RPROVIDES:${PN} += "qore-json-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
