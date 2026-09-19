SUMMARY = "Python subprocess interface"
DESCRIPTION = "sh is a full-fledged subprocess replacement for Python 2.6 - 3.6, PyPy \
and PyPy3 that allows you to call any program as if it were a \
function: \
 \
    from sh import ifconfig \
    print ifconfig('eth0') \
 \
sh is not a collection of system commands implemented in Python."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-sh-2.4.0-1.1.noarch.rpm"
RPM_HASH = "24dfc210b92b168f472906452e15470c52aaaef6119b89c77cb6c6789caa70bab64561cf377204ea26bd0b0305f16b79a566eeacb6ea69ae275a027efdd50645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sh \
python314-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
