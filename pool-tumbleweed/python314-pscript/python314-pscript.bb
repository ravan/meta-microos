SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "python314-pscript-0.8.1-1.2.noarch.rpm"
RPM_HASH = "df905e009647bf94e8332f411fa90824c2a96c2363246cf60461b9d7edc87a0cd37e68666e915b1c72c274fbd7c8999c7f6d3bf8a52747fe9ad11c3c7457e6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pscript \
python314-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
