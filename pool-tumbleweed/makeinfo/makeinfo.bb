SUMMARY = "Translator for converting texinfo documents to info format"
DESCRIPTION = "Makeinfo translates Texinfo source documentation to various other \
formats, by default Info files suitable for reading online with Emacs \
or standalone GNU Info."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "makeinfo-7.3-1.5.aarch64.rpm"
RPM_HASH = "60270a61daa1bd58facf4429ec2e4c783cf71157ca3f0a814524b8a0a42c740f5c157eb7e6de9f165ce7cec39d3c5131c404ba0652a72744df52e95f6e2e4a87"

RPROVIDES:${PN} += "libtexinfo-convert.so.1 \
libtexinfo-convertxs.so.1 \
libtexinfo-main.so.0 \
libtexinfo.so.1 \
libtexinfoxs.so.1 \
makeinfo \
texinfo-/usr/bin/makeinfo"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
gettext-runtime \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
