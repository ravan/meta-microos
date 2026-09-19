SUMMARY = "Program for reading and writing spatial data files"
DESCRIPTION = "Command-line interface for reading and writing spatial data \
using OGR's Fiona package."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "fiona-fio-1.10.1-3.1.noarch.rpm"
RPM_HASH = "0ca4f77caec81c06d8b05b16078cb342659a4df69d4734743f4638c4b5cb499b046a6ca5a0a8ddd60e6de8813b4fa47544b4b7c6cd83ab0354f0262f1c52f297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fiona-fio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-Fiona"

inherit rpm
