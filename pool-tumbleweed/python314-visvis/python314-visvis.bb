SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python314-visvis-1.15.0-2.2.noarch.rpm"
RPM_HASH = "23747923b5f75901cbf7945c5bcef4f82001a596b447426cb594b40432adebf7435a2a04728ecddf962cea5ddea6560e080dd06714ebfa8309f27eb5a9ec15e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-visvis \
python314-visvis \
python3dist-visvis"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-opengl \
python314-qt5"

inherit rpm
