SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python313-visvis-1.15.0-2.2.noarch.rpm"
RPM_HASH = "c27bbb250a3baab0c1b5b909ce8bfb73b35cc0549fcf5447985f6ae609771a459d3e418947da9021befa129bbda74595e0538a1df4652b122711d2b1bb0e748f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visvis \
python3.13dist-visvis \
python313-visvis \
python3dist-visvis"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-opengl \
python313-qt5"

inherit rpm
