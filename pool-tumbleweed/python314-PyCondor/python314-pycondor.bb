SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-PyCondor-0.6.1-1.2.noarch.rpm"
RPM_HASH = "e4d85e6414f3d71ee8a03c4abcc9ad6d05aebae941569d566ab1e3b54dad74cf32ba8d9ee18d973113dfb2deff1a455e9db0f9043fdceffac095fc348d720f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycondor \
python314-PyCondor \
python3dist-pycondor"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click"

inherit rpm
