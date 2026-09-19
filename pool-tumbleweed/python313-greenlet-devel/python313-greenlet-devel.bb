SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "3.5.5"

RPM_NAME = "python313-greenlet-devel-3.5.5-1.1.noarch.rpm"
RPM_HASH = "cc85adf492cd16d2ea618067b52625e20cef13e03a80c92d5feed6f4b9ec4a59581db7cd1c0409724227ed2da93f66233e5ed2ba69c1a4b160f238d9d6db03b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-greenlet-devel \
python313-greenlet-devel"

RDEPENDS:${PN} += "python313-greenlet"

inherit rpm
