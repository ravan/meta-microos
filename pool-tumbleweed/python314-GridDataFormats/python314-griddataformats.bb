SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python314-GridDataFormats-1.2.0-1.2.noarch.rpm"
RPM_HASH = "c50216eea30028e25eefa92d3dbb5a919c48de9e09e0b2b67869fe116ccf8525eea46a214d4005d402510c7679d8bbac3546a358e08812fe2d98d4cbbc1b7021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-griddataformats \
python314-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python314-mrcfile \
python314-numpy \
python314-scipy"

inherit rpm
