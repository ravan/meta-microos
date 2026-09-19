SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-20260902-1.1.noarch.rpm"
RPM_HASH = "c8868a99d3af38f503f3e50d80c042098403bf0af8ede97f1742b0b349d74acb247264ad04136e0ca052041c7a9bc1efeaf5d60ee66ef92007e24222584bab02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
gzip \
make \
tar"

inherit rpm
