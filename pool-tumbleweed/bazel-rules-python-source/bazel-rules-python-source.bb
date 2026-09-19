SUMMARY = "Source code of bazel-rules-python"
DESCRIPTION = "Bazel rules for packaging and distributing software written in Python. \
 \
This package contains source code of bazel-rules-python."
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "bazel-rules-python-source-0.0.1-1.17.noarch.rpm"
RPM_HASH = "0ae2e91bc27a9eced70504fe8073a7676cee2994fb020171fae550ecc52b923af3b990acf85c173b4422adcddd481bfdc21803aa45220859de7da68537809104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-python-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
