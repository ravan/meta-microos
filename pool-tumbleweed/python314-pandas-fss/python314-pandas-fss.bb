SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-fss-3.0.5-2.2.noarch.rpm"
RPM_HASH = "ec746ab1fa489fbc507365626f8e4a7f2dae1042337bb2cc886e2b9ce55b001dda18ac2eda4fb56137a098ed6934e010dd86311195077e7e7220736a00ab7dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-fss"

RDEPENDS:${PN} += "python314-fsspec \
python314-pandas"

inherit rpm
