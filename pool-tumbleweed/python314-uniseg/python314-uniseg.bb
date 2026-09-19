SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python314-uniseg-0.7.2-2.5.noarch.rpm"
RPM_HASH = "9829be52cdd26e70909223c207208d73333a445d71db7e04d89b6c01b52c4e0a1158ff53778bf7f4c3dc0e55ee473f85a1bd5f1197440a042886775dd87f5696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uniseg \
python314-uniseg \
python3dist-uniseg"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
