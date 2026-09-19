SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-hppa-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "5f4c500696cb381ace274d120a458dae90496e0f92f0894d20c7e075de84f0462914bcba4f6c024e81962a5b5abcdd77d6e89b76dffd3c0590bde70b454c268c"

RPROVIDES:${PN} += "cross-hppa-gcc16 \
hppa-suse-linux-gcc"

RDEPENDS:${PN} += "cross-hppa-binutils \
cross-hppa-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
