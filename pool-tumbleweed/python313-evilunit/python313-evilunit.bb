SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-evilunit-0.2.1-2.5.noarch.rpm"
RPM_HASH = "89083ac95e0f3f3d7e613437a89d7862c2ecc0c0f56f8b357644dde9aa2378ef42102515fe64bb8a980f207327875523eec89b8293079b92887bd08f2ef608e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evilunit \
python3.13dist-evilunit \
python313-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
