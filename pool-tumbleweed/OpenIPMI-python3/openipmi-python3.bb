SUMMARY = "Python module and GUI for OpenIPMI"
DESCRIPTION = "The Python parts provide an OpenIPMI Python library and a GUI, openipmigui, \
that makes use of it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.37.13+git.1181df8"

RPM_NAME = "OpenIPMI-python3-2.0.37.13+git.1181df8-1.6.aarch64.rpm"
RPM_HASH = "5c50cd3aba680fbb9f4047802293f455fa31ff63ecd9d8ec1cf59964546a358c1d7725de1aa432eb663fb86a9f187555bf8aebceb3ff319564c5d7f7ba4e117f"

RPROVIDES:${PN} += "OpenIPMI-python3 \
openipmigui"

RDEPENDS:${PN} += "/usr/bin/python3 \
OpenIPMI \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIpthread.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
python-abi \
python3-tk \
tix"

inherit rpm
