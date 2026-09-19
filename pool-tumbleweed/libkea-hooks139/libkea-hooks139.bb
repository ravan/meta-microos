SUMMARY = "Kea DHCP server hook library"
DESCRIPTION = "The hooks framework is a Kea system that simplifies the way that \
users can write code to modify the behavior of Kea. Instead of \
altering the Kea source code, they write functions that are compiled \
and linked into one or more dynamic shared objects. The library is \
specified in the Kea configuration and, at runtime, Kea dynamically \
loads the library into its address space. At various points in the \
processing, the component 'calls out' to functions in the library, \
passing to them the data is it currently working on. They can examine \
and modify the data as required."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-hooks139-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "f198594d04fd4c5124b4df1376d42d0503953c5ddb3bbd4f6c8ca36b437bd37a4068d6e92dab46d9c73d0d39274d622138e00738406e6fa183bc770a848e9640"

RPROVIDES:${PN} += "libkea-hooks.so.139 \
libkea-hooks139"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.98 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
