SUMMARY = "File System Benchmark"
DESCRIPTION = "Bonnie is a popular performance benchmark that targets various aspects \
of Unix file systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "bonnie-1.6-2.9.aarch64.rpm"
RPM_HASH = "79b5041f0d4306cccb43468f927a492fa0ddbb2c25ba96bdf7469078bd3aa584e63fbfe729f3e69b438abda032ba474f83eeee675c73636c609d019cba47263a"

RPROVIDES:${PN} += "bonnie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
