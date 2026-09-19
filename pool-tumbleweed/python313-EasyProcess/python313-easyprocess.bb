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

RPM_NAME = "python313-EasyProcess-1.1-4.5.noarch.rpm"
RPM_HASH = "28b5c5d6a36b42f7460b96d868911892d57fac984eca61c4cae29cfc7a1639b1ee4b2eea598f34774d46dfbb0e36a2283640482eb502a9870a235dea76264fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EasyProcess \
python3.13dist-easyprocess \
python313-EasyProcess \
python3dist-easyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
