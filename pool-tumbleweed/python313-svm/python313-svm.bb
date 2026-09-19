SUMMARY = "Python bindings for libsvm"
DESCRIPTION = "This package contains the Python bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.36"

RPM_NAME = "python313-svm-3.36-1.6.noarch.rpm"
RPM_HASH = "7faa21cfb516af7c04000fe5020c68cd2c1269d8a66fc340b74865c8d110528ee893c8f8503bcb6e3d63e9a2639daf6f6a2baa10b22db51be226510cf7ce0505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-svm \
python313-svm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gnuplot \
python-abi \
svm-tools"

inherit rpm
