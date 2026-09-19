SUMMARY = "Tool to list content of virtual tables in a C++ shared library"
DESCRIPTION = "vtable-dumper is intended for developers of software libraries and \
maintainers of Linux distributions who are interested in ensuring \
backward binary compatibility."
LICENSE = "GPL-2.0+ | LGPL-2.0+"

PV = "1.2"

RPM_NAME = "vtable-dumper-1.2-1.29.aarch64.rpm"
RPM_HASH = "579f0e71c02b5e1cbed08b260193c3d6208001f6156bb611cf50958bb229e90af38234c28ba3b41e24efba2e20699da99547b95ee7602cf014f5206930917d95"

RPROVIDES:${PN} += "vtable-dumper"

RDEPENDS:${PN} += "libc.so.6 \
libelf.so.1 \
libstdc++.so.6"

inherit rpm
