SUMMARY = "Libraries for foreign function call interfaces"
DESCRIPTION = "This is a collection of four libraries which can be used to build \
foreign function call interfaces in embedded interpreters.  The four \
packages are: \
 - avcall: calling C functions with variable arguments \
 - vacall: C functions accepting variable argument prototypes \
 - trampoline: closures as first-class C functions \
 - callback: closures with variable arguments as first-class C functions \
   (a reentrant combination of vacall and trampoline)"
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "ffcall-2.5-1.9.aarch64.rpm"
RPM_HASH = "1da88295abd2ea34b260f20130e7774375e369372306b9d60adfeb825c0dd35498e6cc13c05c449d420ef03bee6b90effde09f649255f3b9ab6db37d762da962"

RPROVIDES:${PN} += "ffcall \
ffcall-devel \
rpm-macro-ffcall-arches"

RDEPENDS:${PN} += "libavcall1 \
libcallback1 \
libffcall0 \
libtrampoline1"

inherit rpm
