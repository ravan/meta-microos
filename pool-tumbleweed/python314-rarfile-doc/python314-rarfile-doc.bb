SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.2"

RPM_NAME = "python314-rarfile-doc-4.2-3.5.noarch.rpm"
RPM_HASH = "340379340aee9531bbb5783e952bb01c5f75ed2cbfe9e4bf272f4bfe19ae6af1dcd7a3e707a75be127a2c11b69b33aa6ffcb394cc65ee5c7ade0da65d57491b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
