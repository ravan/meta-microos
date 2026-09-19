SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python314-mutmut-3.8.0-1.1.noarch.rpm"
RPM_HASH = "93314e3f229f055103bec0d07a1dfce3b08400463cbf1f06590fbe90e55b6449765d6f9c6886501369fe84c962a30d8e214e875f1c6840cf053ae2c7b40816ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mutmut \
python314-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-coverage \
python314-libcst \
python314-pytest \
python314-setproctitle \
python314-textual"

inherit rpm
