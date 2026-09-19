SUMMARY = "The python pandas[pyarrow] extra"
DESCRIPTION = "This package provides the [pyarrow] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-pyarrow-3.0.5-2.2.noarch.rpm"
RPM_HASH = "9ed72a1ffe4f3ca746469fae3c7e81af60c5adc52a4f06cf767ec349f3a68e09fefb87ab66cc8d855238a378788738d594043d916d1c4383080442c9a7a18a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-pyarrow"

RDEPENDS:${PN} += "python314-pandas \
python314-pyarrow"

inherit rpm
