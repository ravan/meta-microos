SUMMARY = "Development files for kbibtex"
DESCRIPTION = "This package contains the development files for kbibtex."
LICENSE = "GPL-2.0-only"

PV = "0.10.50git.20260801T020758~7ee937e1"

RPM_NAME = "kbibtex-devel-0.10.50git.20260801T020758~7ee937e1-1.1.aarch64.rpm"
RPM_HASH = "d530cf4172d38651ab3f438363dbbab45c38b78de823a43e73774bae837162cca6c6d1a5982bf1589a36147c878b7401e870874a36a4c263bf72f6ba0a89214b"

RPROVIDES:${PN} += "cmake-KBibTeXConfig \
cmake-KBibTeXData \
cmake-KBibTeXGUI \
cmake-KBibTeXGlobal \
cmake-KBibTeXIO \
cmake-KBibTeXNetworking \
cmake-KBibTeXProcessing \
kbibtex-devel"

RDEPENDS:${PN} += "kbibtex"

inherit rpm
