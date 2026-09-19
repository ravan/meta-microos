SUMMARY = "Development files for oprofile, a system-wide profiler for Linux"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the files needed to develop JIT agents for other \
virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "oprofile-devel-1.4.0-5.2.aarch64.rpm"
RPM_HASH = "8992c0627b7eb49692b1ef2542473cdc873dac1510b3b4ff07d99442ca80394ab665d97f20a1cf6497870e48ee42f17f0f1482938f85013d0adf3fc246791e86"

RPROVIDES:${PN} += "oprofile-devel"

RDEPENDS:${PN} += "binutils-devel \
libopagent1"

inherit rpm
