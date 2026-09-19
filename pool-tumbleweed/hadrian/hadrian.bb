SUMMARY = "GHC Hadrian buildsystem tool"
DESCRIPTION = "This provides the hadrian tool used to build ghc."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "hadrian-0.1.0.0-2.3.aarch64.rpm"
RPM_HASH = "e72361510938ed486bab34d46db48bd7825fe1facad6e88c0bfc9fad81a45783d304b535b4c6c77c22020cef56d6ce56eb5154cc2a7f9b28246f043f66c4c0da"

RPROVIDES:${PN} += "hadrian"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
