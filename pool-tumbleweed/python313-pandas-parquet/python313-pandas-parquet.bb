SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-parquet-3.0.5-2.2.noarch.rpm"
RPM_HASH = "1b93c20806d7c54beb539b2b4e82061931c4cd803973e575e7429c7f75933171f77646e19f896bfeda082a8b826e3fde69d1901f2f3471319415457a867b8931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-parquet \
python313-pandas-parquet"

RDEPENDS:${PN} += "python313-pandas \
python313-pyarrow"

inherit rpm
