SUMMARY = "X11 protocol Composite extension client library"
DESCRIPTION = "The Composite extension causes a entire sub-tree of the window \
hierarchy to be rendered to an off-screen buffer. Applications can \
then take the contents of that buffer and do whatever they like. The \
off-screen buffer can be automatically merged into the parent window \
or merged by external programs, called compositing managers."
LICENSE = "MIT"

PV = "0.4.7"

RPM_NAME = "libXcomposite1-0.4.7-1.4.aarch64.rpm"
RPM_HASH = "73738b33a77a39c7da3ace56fbdbcff4b249890db6c1dfa67264c247b4021e36ba52a3e5c1334c0139617273abfd28ee9aad2a25dcd06b09fefef0bd7e19cada"

RPROVIDES:${PN} += "libXcomposite.so.1 \
libXcomposite1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
