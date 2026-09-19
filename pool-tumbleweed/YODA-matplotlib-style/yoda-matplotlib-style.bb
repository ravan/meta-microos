SUMMARY = "Matplotlib style file for YODA styled plots"
DESCRIPTION = "This package provides a style file that may be used with matplotlib to produce \
YODA styled plots."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "YODA-matplotlib-style-2.1.2-1.5.noarch.rpm"
RPM_HASH = "b7017a9b256ff287c9c47a2e342cc1afaa5b443dd1d465836b72378fafa9ff5a1530722dddb75e9744a7fd759d3643c0c5c3fa8f7cb638b304904cad37317af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "YODA-matplotlib-style"

RDEPENDS:${PN} += "python3-matplotlib"

inherit rpm
