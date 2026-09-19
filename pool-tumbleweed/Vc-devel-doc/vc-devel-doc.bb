SUMMARY = "API documentation for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides the API documentation"
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "Vc-devel-doc-1.4.5-1.10.noarch.rpm"
RPM_HASH = "c93e3ee62328fd04441f67f8df81c2462d21d83282e72d516b4f9558a5c685e52c49d7d022bce45af74d9fef7299cd128eec4ab6c974259ba185a3c6043d5597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Vc-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
