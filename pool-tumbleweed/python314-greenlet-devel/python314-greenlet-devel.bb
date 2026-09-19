SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "3.5.5"

RPM_NAME = "python314-greenlet-devel-3.5.5-1.1.noarch.rpm"
RPM_HASH = "368c46a54b96178e00099780d2da7cb9d565542786bd5c689ed69b99fc8318382d96812d81e2ca882670c8791d2067aca3f52b5039394505cfcc0039e52be722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-greenlet-devel"

RDEPENDS:${PN} += "python314-greenlet"

inherit rpm
