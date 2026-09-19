SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.2.1"

RPM_NAME = "python314-invoke-2.2.1-1.4.noarch.rpm"
RPM_HASH = "a06727213dc6df78c5ffeed812477277813543bfb8b98e4de9f4a3e6e265e3855ff6e376d95d4002ff6f0dbb9171043df68df665e84c6fa65c103e623952ee06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-invoke \
python314-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-fluidity-sm \
python314-lexicon"

inherit rpm
