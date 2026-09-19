SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python314-power-1.4-4.5.noarch.rpm"
RPM_HASH = "7dad0cdbfce6219d07ed794ccbb8844eae210d8b907672f243bef1a258de479f68949d1ba6ddc6f3927e3f4074958acc0dbc83d134879e865fb9ee6ca4ddc3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-power \
python314-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
