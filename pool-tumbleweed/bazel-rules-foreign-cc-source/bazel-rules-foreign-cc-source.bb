SUMMARY = "Source code of bazel-rules-foreign-cc"
DESCRIPTION = "Rules for building C/C++ projects using foreign build systems inside Bazel \
projects. \
 \
This package contains source code of bazel-rules-foreign-cc."
LICENSE = "Apache-2.0"

PV = "20190926"

RPM_NAME = "bazel-rules-foreign-cc-source-20190926-1.18.noarch.rpm"
RPM_HASH = "900f79e71d3673262dbce39a64b9af489a8b040c8ef2f92f3320fd53a367a1909268b9734c7f1e7114ea42142c534dbc3cf551ffae33fefa749123c7450f7855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-foreign-cc-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
