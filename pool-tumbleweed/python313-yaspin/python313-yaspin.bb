SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python313-yaspin-3.4.0-1.4.noarch.rpm"
RPM_HASH = "41e43ed3f36fbafb9b7f0a69ff0bceebe4b0155ad161e6f6fa32842d490f4118b4438826aca5490521673483e41a623cb2b43cc0de4469b900bb9711ee1f7a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaspin \
python3.13dist-yaspin \
python313-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi \
python313-termcolor"

inherit rpm
