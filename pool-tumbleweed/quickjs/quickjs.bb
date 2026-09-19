SUMMARY = "Small and embeddable Javascript engine"
DESCRIPTION = "QuickJS is a small and embeddable JavaScript engine and compiler that supports reference ES2020."
LICENSE = "MIT"

PV = "20260604"

RPM_NAME = "quickjs-20260604-2.3.aarch64.rpm"
RPM_HASH = "4d88ef9d263e8387a7b326a9867bbd8307e89f4829d57132fdee85c444c2d623b14edb3c85e1c357959cc7cace1fdb55ce969f3de464267a0de5a3313e5c4ed9"

RPROVIDES:${PN} += "quickjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
