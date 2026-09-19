SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-hppa-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "418474778bc1a42bd3439e0348f8540e9839081c3aa71802703aee929548a4c32651d8934950dd602ba1094f235b1cc38f30f1d6f333d03b762168d65ab7c5d6"

RPROVIDES:${PN} += "cross-hppa-gcc14-bootstrap \
hppa-suse-linux-gcc"

RDEPENDS:${PN} += "cross-hppa-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
