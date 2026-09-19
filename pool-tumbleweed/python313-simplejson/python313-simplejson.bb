SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "4.1.1"

RPM_NAME = "python313-simplejson-4.1.1-1.4.aarch64.rpm"
RPM_HASH = "3f369cf8ba722fd774edd61cc1df64c249eef19c24bdd237a5d7fe6cc19b85ab1524a59746a708c79a12d5f74138a80090775a8d30d1456f41bf52c4c1e02fae"

RPROVIDES:${PN} += "python3-simplejson \
python3.13dist-simplejson \
python313-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
