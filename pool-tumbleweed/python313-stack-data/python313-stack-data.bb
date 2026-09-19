SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python313-stack-data-0.6.3-4.3.noarch.rpm"
RPM_HASH = "0b47a7db6d8ce82f7682eef4d0fcbfb973b8038f72c08af2b10a2eae3040204578ab95d547c3dc0465c07d1d08f50e5bbb8e411ab080c27f2038dc3e13534226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stack-data \
python3.13dist-stack-data \
python313-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python313-asttokens \
python313-executing \
python313-pure-eval"

inherit rpm
