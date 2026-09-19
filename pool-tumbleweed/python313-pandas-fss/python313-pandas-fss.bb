SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-fss-3.0.5-2.2.noarch.rpm"
RPM_HASH = "b9197a4023cf707aec4d922ee5239da5ea3d0ed278c12ae63929b5d745a463bfc040c082b4fa428f2af8caf0e422aa4513eb7fdb138f58d2e64174800af41698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-fss \
python313-pandas-fss"

RDEPENDS:${PN} += "python313-fsspec \
python313-pandas"

inherit rpm
