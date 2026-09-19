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

RPM_NAME = "python313-sh-2.4.0-1.1.noarch.rpm"
RPM_HASH = "68d2f6c70ff54bc79c0dab6d1f459812404e931c952d8d30d2d8f3d1f2536570d608504660a4d67214a6c62e431cd93adc8d478a89456c05d8c0115c47240145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sh \
python3.13dist-sh \
python313-sh \
python3dist-sh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
