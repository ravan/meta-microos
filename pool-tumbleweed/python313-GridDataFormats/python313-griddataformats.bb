SUMMARY = "Python Tools for Reading and writing of data on regular grids"
DESCRIPTION = "The *gridDataFormats* package provides classes to unify reading and \
writing n-dimensional datasets. One can read grid data from files, \
make them available as a :class:`Grid` object, and allows one to \
write out the data again."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python313-GridDataFormats-1.2.0-1.2.noarch.rpm"
RPM_HASH = "183112c0da4baaae291230011d3bfc58da902033b341d7197b8a7f13b4ace9254af52864a6a9d5f606d0b36c60b573bfea9c9e7d810d37038cb07841a78d2b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GridDataFormats \
python3.13dist-griddataformats \
python313-GridDataFormats \
python3dist-griddataformats"

RDEPENDS:${PN} += "python-abi \
python313-mrcfile \
python313-numpy \
python313-scipy"

inherit rpm
