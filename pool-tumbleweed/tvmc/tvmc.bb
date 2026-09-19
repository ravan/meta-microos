SUMMARY = "TVM command line driver"
DESCRIPTION = "TVMC is a tool that exposes TVM features such as auto-tuning, compiling, \
profiling and execution of models, via a command line interface."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "tvmc-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "d4c89d819c202541b313d8a26c5fd1fc2a2f2529b9f59a532b7789a19377b485aeb2e822ba3d28506f6faff66dd6d0fd5d0d72169382f2093ffaccc409f02ca3"

RPROVIDES:${PN} += "tvmc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtvm \
python3-scipy \
python3-setuptools \
python3-tvm"

inherit rpm
