SUMMARY = "A libbytesize tool"
DESCRIPTION = "This package solely contains the bscalc tool."
LICENSE = "LGPL-2.1-only"

PV = "2.12"

RPM_NAME = "bscalc-2.12-1.6.noarch.rpm"
RPM_HASH = "1ff8dea78347cdeb8cd8eca1649ca20ee250971c2dae874d1c8f78e9a0aff42e859cfa9689376821be33cf2eb5b2638e96be56930fabdd3f3a77cc669ec3fbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bscalc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libbytesize1"

inherit rpm
