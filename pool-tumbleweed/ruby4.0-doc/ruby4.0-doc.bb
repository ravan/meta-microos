SUMMARY = "Documentation and samples for Ruby"
DESCRIPTION = "Documentation and samples for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "4.0.6"

RPM_NAME = "ruby4.0-doc-4.0.6-2.1.aarch64.rpm"
RPM_HASH = "0477d8d0a559150179eb027b46cf7d744bc6a92177e8c63e9a6ee0edb5fde31f3d3390372ce1d1a3b3810fd026f2cf5834ed7660ce9e9f2dc8aec84d1c381c40"

RPROVIDES:${PN} += "ruby4.0-doc"

RDEPENDS:${PN} += ""

inherit rpm
