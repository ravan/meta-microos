SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python314-sdnotify-0.3.2-3.5.noarch.rpm"
RPM_HASH = "2655ed47ed2f4fc7e5de43b3a1dcbe6aac4c21906b5305cf8063d148254d2d55b8437d6074ea20cea7fa175583a793e7072b23d4510d20c334ad3010ddcecc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sdnotify \
python314-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
