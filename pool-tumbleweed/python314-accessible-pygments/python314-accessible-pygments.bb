SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "python314-accessible-pygments-0.0.5-1.5.noarch.rpm"
RPM_HASH = "ca7f45dc4a0551d98c765d8c5ef8334e5420629d24c2e9f633a57a40c8fcde4b22e31db53ca926bbe1d9834948ca62cc22121e109fb398dafc86f38515203f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-accessible-pygments \
python314-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python314-pygments"

inherit rpm
