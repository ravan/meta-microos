SUMMARY = "Base Development"
DESCRIPTION = "Minimal set of tools for compiling and linking applications."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-20170319-13.4.aarch64.rpm"
RPM_HASH = "6906a7dae14f5867340f00bd7ccfd5bf6462cb0bf72035aa4787da4c516e3cdcb70990a96a0f2fa8c2e363fd0c03eb0c589d9b0cd4acc6a32f65c03a6b2f30be"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-basis"

RDEPENDS:${PN} += "autoconf \
automake \
awk \
binutils \
bison \
cpp \
flex \
gcc \
gdbm-devel \
gettext-tools \
glibc-devel \
libtool \
m4 \
make \
makeinfo \
ncurses-devel \
patch \
pattern- \
zlib-devel"

inherit rpm
