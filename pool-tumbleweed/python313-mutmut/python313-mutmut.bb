SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python313-mutmut-3.8.0-1.1.noarch.rpm"
RPM_HASH = "e704f4248ebd053831a7184268bf807aba0608187ea9f8f09c0b7dcf00508880b35bc666461c2fe3c6b95bb6bc03ab8e0cf26100a6ed0aec0c6d5753e51f9962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutmut \
python3.13dist-mutmut \
python313-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-coverage \
python313-libcst \
python313-pytest \
python313-setproctitle \
python313-textual"

inherit rpm
