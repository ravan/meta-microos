SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python314-easydev-0.14.0-1.2.noarch.rpm"
RPM_HASH = "d7f9fdd7d2a0d2b96c77639f55303176e16aebf52f754ec69c61944c713922d35e4d5da76b7e11e7853f327b2bae4e9005ee8990dca4afae4274e013d70cb702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easydev \
python314-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "python-abi \
python314-colorama \
python314-colorlog \
python314-line-profiler \
python314-pexpect \
python314-platformdirs \
update-alternatives"

inherit rpm
