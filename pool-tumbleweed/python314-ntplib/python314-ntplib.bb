SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-ntplib-0.4.0-2.5.noarch.rpm"
RPM_HASH = "466ee7ed816d7edaa84267e2370577dd42296b36087f7b3014ebff02d4097ce238456dc950067dc01fcff8118edfc347a59985eecf4881afb1847bbb148be92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ntplib \
python314-ntplib \
python3dist-ntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
