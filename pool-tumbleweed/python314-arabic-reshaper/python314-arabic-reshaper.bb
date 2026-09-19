SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-arabic-reshaper-3.0.0-2.12.noarch.rpm"
RPM_HASH = "e689752d3ba4d75a84cfd9e53cef47e4f3419e3317f05a70801ab3d2781d8aef7fbb9f57e7e09d73eb80990f36b1a1832c891329ec7e84899553dfd49e3668b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arabic-reshaper \
python314-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
