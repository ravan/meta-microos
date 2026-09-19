SUMMARY = "Samba Documentation"
DESCRIPTION = "This package contains all the Samba documentation as it is not part of \
the man pages."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-doc-4.24.6+git.488.e38f6c96c62-1.1.noarch.rpm"
RPM_HASH = "386e79dc8b6b98a01e9dd5abf7df4617d81f14d7bf6327e7eb5209f8930c744b4368719b628f2d14efbb82f78e224644c7ee7be6b1f3b8d140ad607b719ecb2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "samba-doc"

RDEPENDS:${PN} += "coreutils \
findutils"

inherit rpm
