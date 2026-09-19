SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-performance-3.0.5-2.2.noarch.rpm"
RPM_HASH = "095ffb9c4bc49c1e3d2ec1b8e3338f6ac9861b38b4183a6501711997c2cba11acdd0ad951cfe1d016e3db10486ab0b30ec1bcc416fa9c74209d4dca4379924d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-performance"

RDEPENDS:${PN} += "python314-Bottleneck \
python314-numba \
python314-numexpr \
python314-pandas"

inherit rpm
