SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python313-sdnotify-0.3.2-3.5.noarch.rpm"
RPM_HASH = "1acf53ad83c5870f4ef602e4611bdc84ab1b73c15229a2ac944d20cabf72887bddefab6a457648fb04e02c52b8a450a7fe4442255306e15c9c038ca23a462f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sdnotify \
python3.13dist-sdnotify \
python313-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
