SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-parquet-3.0.5-2.2.noarch.rpm"
RPM_HASH = "8fcdce327fc50e9ddf2a46b02c1dfa5cd27b8ba895d6fcc11fdff2561bd18f1d59cecc995ef0e28135704f068c7c363f508852a318d847350b158db2544b04b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-parquet"

RDEPENDS:${PN} += "python314-pandas \
python314-pyarrow"

inherit rpm
