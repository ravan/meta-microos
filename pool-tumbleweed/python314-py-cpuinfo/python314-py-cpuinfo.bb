SUMMARY = "Python library and tool to get CPU info"
DESCRIPTION = "Py-cpuinfo gets CPU info with pure Python. Py-cpuinfo should work \
without any extra programs or libraries, beyond what your OS \
provides. It supports Linux, OS X, Windows, BSD, Solaris, \
Cygwin, Haiku, and BeagleBone, but only on x86 and some ARM CPUs. \
 \
These approaches are used for getting info: \
 1. Windows Registry (Windows) \
 2. /proc/cpuinfo (Linux) \
 3. sysctl (OS X) \
 4. dmesg (Unix/Linux) \
 5. isainfo and kstat (Solaris) \
 6. cpufreq-info (BeagleBone) \
 7. lscpu (Unix/Linux) \
 8. sysinfo (Haiku) \
 9. Querying the CPUID register (Intel X86 CPUs)"
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python314-py-cpuinfo-9.0.0-5.5.noarch.rpm"
RPM_HASH = "e784e829ec3c4da1899ae96b7bec8506eb9ae7cec227b27ec09d561f63ba84c7c4c14c2177a0fd9dd5bcc22eab28de7f7b3f3d776776bc10564628162f04011a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-cpuinfo \
python314-py-cpuinfo \
python3dist-py-cpuinfo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
