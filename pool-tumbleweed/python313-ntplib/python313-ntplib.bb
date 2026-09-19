SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-ntplib-0.4.0-2.5.noarch.rpm"
RPM_HASH = "b1b9bb3bdfea14e1779dcce01a87811454e66212fa10abc0b5ee9016e9872a1424e7fc1982d425a9b6943ec7e75b2f7889d1c9722dfaf0ab2122c7ceb4ce819d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntplib \
python3.13dist-ntplib \
python313-ntplib \
python3dist-ntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
