SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.5"

RPM_NAME = "python314-pyhcl-0.4.5-2.5.noarch.rpm"
RPM_HASH = "93b7075710807dee487c46cacb06e3da755c399b161fef28b290604afd5553552aef5198cd90f080c549acbbf55c619d4d4cd44e63c28c7d43555c369c428a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhcl \
python314-pyhcl \
python3dist-pyhcl"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
