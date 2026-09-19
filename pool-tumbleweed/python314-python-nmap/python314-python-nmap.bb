SUMMARY = "Python class for using nmap from Python"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python314-python-nmap-0.7.1-1.9.noarch.rpm"
RPM_HASH = "6a991ee63bf97fa2af15a5cbd8efd4068da5551ccd7101e88f365c751f1be4d68777d4fdab0cbad4da0821632067d22caff5f5e637db9936de0381cf873a5116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-nmap \
python314-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
