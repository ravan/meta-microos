SUMMARY = "Utility scripts for saxon10"
DESCRIPTION = "Utility scripts for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-scripts-10.9-5.5.noarch.rpm"
RPM_HASH = "d2359934b71fcb215a5439224eb7906ab728b708a05c0a2dba1c0bc51d2516aec1004e5cc7b1467376f6fc30d50c164aaa178aab9886322d89810f8550b6bec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-tools \
jline \
saxon10 \
xerces-j2 \
xml-commons-apis"

inherit rpm
