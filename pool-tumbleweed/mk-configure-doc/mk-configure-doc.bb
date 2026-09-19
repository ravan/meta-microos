SUMMARY = "Mk-configure documentation"
DESCRIPTION = "Mk-configure package: examples and presentation."
LICENSE = "BSD-2-Clause & MIT & ISC"

PV = "0.40.0"

RPM_NAME = "mk-configure-doc-0.40.0-1.4.noarch.rpm"
RPM_HASH = "31cbeaebb219153566b91045d0a0e109849d6416fae2972ca9eac0f4e3caabdb46e77fc8bd6cdd8c6edebf5eacf6cf622f20f8825b154a0a8755861f99ba1228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mk-configure-doc"

RDEPENDS:${PN} += "mk-configure"

inherit rpm
