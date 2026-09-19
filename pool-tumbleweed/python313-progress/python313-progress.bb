SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "python313-progress-1.6.1-1.5.noarch.rpm"
RPM_HASH = "c3a1634c374a51b884ede9e49fce88f8b2675f4e7ce2ec4aa4c6507280701cc7371f53da2b10c0ed151e26ff8aa2ef3ffc5a8432e8bbce21ead09ee589561cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progress \
python3.13dist-progress \
python313-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
