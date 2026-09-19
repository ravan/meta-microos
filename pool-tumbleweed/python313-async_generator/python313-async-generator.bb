SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python313-async_generator-1.10-4.5.noarch.rpm"
RPM_HASH = "2b799d87706df19b14cf1a81b31fc647310de093719f437985f5b536fa345f59f76753b104009ebc7de43819541e5f5e7b9fb5d2978db63097fd44ab4d149e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-async-generator \
python3.13dist-async-generator \
python313-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
