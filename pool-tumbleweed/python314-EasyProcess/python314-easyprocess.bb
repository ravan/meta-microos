SUMMARY = "Python subprocess interface"
DESCRIPTION = "EasyProcess is a Python subprocess interface. \
 \
Features include: \
 - layer on top of subprocess module \
 - starting and stopping of programs \
 - retrieval of standard output/error, return code of programs \
 - command can be list or string \
 - logging \
 - timeout \
 - unit-tests \
 - cross-platform, development on linux \
 - global config file with program aliases \
 - unicode support \
 - supported python versions: 2.5, 2.6, 2.7, 3.1, 3.2, PyPy \
 \
Limitations: \
 - shell is not supported \
 - pipes are not supported \
 - stdout/stderr is set only after the subprocess has finished \
 - stop() does not kill whole subprocess tree"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python314-EasyProcess-1.1-4.5.noarch.rpm"
RPM_HASH = "22449c8aeccf8bb08f4998bb5f59b5aa760e9c6878da9c33df3db5e7163eb6ca869c0cf9078f7f8cac1fc05d6a8f1aa53c8661fc549b8e3229ebda6f05a22481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easyprocess \
python314-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
