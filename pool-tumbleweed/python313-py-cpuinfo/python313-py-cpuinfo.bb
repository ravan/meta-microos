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

RPM_NAME = "python313-py-cpuinfo-9.0.0-5.5.noarch.rpm"
RPM_HASH = "847e794bd6e25465014b081fc008b52658ce698597b5675920bb95304afba8812b903dd5c07d1c95e7a312a486be1f75632c5a3d66e8f18d2a3d78e2548deb82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-cpuinfo \
python3.13dist-py-cpuinfo \
python313-py-cpuinfo \
python3dist-py-cpuinfo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
