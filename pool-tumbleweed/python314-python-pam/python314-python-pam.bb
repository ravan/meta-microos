SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-python-pam-2.0.2-1.12.noarch.rpm"
RPM_HASH = "0ede9ea79575fbac1f036a25848d104eba17b9dd2867713e2844ce38f19249f98df45079b3518732e1b6cc4747e2676dce0e45139681e8594658bfaf83165596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-pam \
python314-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
