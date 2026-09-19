SUMMARY = "QDoc index files and doxygen tag files for Qt 5 API Documentation"
DESCRIPTION = "This package contains the QDoc index files and the doxygen tag files to create cross links between the QCH documentation files. This package is normally not \
required."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtdoc-devel-5.15.19-1.3.noarch.rpm"
RPM_HASH = "612d79b59b0c47c0d1ab3593d31ba3999e0068d26067d42495a55a224a6f2fa5af1aaf1f4ed538b9ed7330c6209529283e47906ec533497710964ed57b803db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-devel"

RDEPENDS:${PN} += "doxygen \
libqt5-qttools"

inherit rpm
