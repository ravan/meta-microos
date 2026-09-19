SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python314-python-args-1.0.2-2.5.noarch.rpm"
RPM_HASH = "cef6e359e2fac1870cd4abfaeb6631a1f820291728590b07d9800e1586d1c1e3dcb952e716a44e0d4fa2c37c3d2539b45f0f7c558035fe9a2a425b2d1da05e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-args \
python314-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
