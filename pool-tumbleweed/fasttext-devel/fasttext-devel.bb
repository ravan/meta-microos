SUMMARY = "Development files for fasttext"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification. \
 \
This package provides the fasttext library development files."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "fasttext-devel-0.9.2-6.7.aarch64.rpm"
RPM_HASH = "9424f4c782bd32fd13146ee568dbcd9d948afed02da0084092209eb90c48af593e4c24ca0849aa24085586edc458b47c1de31645d1e0f2ec7177902754d034c2"

RPROVIDES:${PN} += "fasttext-devel \
pkgconfig-fasttext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfasttext0"

inherit rpm
