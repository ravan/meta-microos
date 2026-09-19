SUMMARY = "Application memory usage report tool"
DESCRIPTION = "smem is a tool that can give numerous reports on memory usage on Linux \
systems. Unlike existing tools, smem can report proportional set size (PSS), \
which is a more meaningful representation of the amount of memory used by \
libraries and applications in a virtual memory system. \
 \
Because large portions of physical memory are typically shared among \
multiple applications, the standard measure of memory usage known as \
resident set size (RSS) will significantly overestimate memory usage. PSS \
instead measures each application's 'fair share' of each shared area to give \
a realistic measure."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "smem-1.5-2.9.aarch64.rpm"
RPM_HASH = "87d05d450144495834068aefeb851951ca0e3b90c8dfb7c62ceac1db4804079843f556ba0875e3a21d76f0699f435a739a5eddda6da43205c7b5538d510239d1"

RPROVIDES:${PN} += "smem"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python3"

inherit rpm
