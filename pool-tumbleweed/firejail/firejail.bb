SUMMARY = "Linux namepaces sandbox program"
DESCRIPTION = "Firejail is a SUID sandbox program that reduces the risk of security \
breaches by restricting the running environment of untrusted applications \
using Linux namespaces and seccomp-bpf. It includes sandbox profiles for \
many existing applications like Iceweasel/Mozilla Firefox and Chromium. \
 \
Firejail also expands the restricted shell facility found in bash by adding \
Linux namespace support. It supports sandboxing specific users upon login."
LICENSE = "GPL-2.0-only"

PV = "0.9.80"

RPM_NAME = "firejail-0.9.80-1.4.aarch64.rpm"
RPM_HASH = "6d4bb093ea527226165345d2fae75166117cd0a73c915d49ef2936e6ab2bf60995ad3d744873c5c7b259cc806bf0adc658a82ca95fffb06e333acb7f304cf882"

RPROVIDES:${PN} += "config-firejail \
firejail \
group-firejail \
libpostexecseccomp.so \
libtrace.so \
libtracelog.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
permissions \
sysuser-shadow"

inherit rpm
