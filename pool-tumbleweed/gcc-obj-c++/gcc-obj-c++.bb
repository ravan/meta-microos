SUMMARY = "The system GNU Objective C++ Compiler"
DESCRIPTION = "The system GNU Objective C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-obj-c++-16-1.1.aarch64.rpm"
RPM_HASH = "f8e3ba33d2ccf0898ea37bf05573a78f76f4ebb7741781a90237a58529169a30921dc53e20c48da41bbacf908367418edd278929bbea93dc5e25a36e3e58cec5"

RPROVIDES:${PN} += "gcc-obj-c++"

RDEPENDS:${PN} += "gcc-objc \
gcc16-obj-c++"

inherit rpm
