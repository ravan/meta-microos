SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python313-daemonize-2.5.0-5.10.noarch.rpm"
RPM_HASH = "d2421c6211f1508e12850cd119928bcb2c3bf7460586a1fef8ba0d6d3b3746aa6e9fc502831f0bc3ce85f7d36a2d33c0cddc49c7669600517f1131dd93eb386d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daemonize \
python3.13dist-daemonize \
python313-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
