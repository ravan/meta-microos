SUMMARY = "OpenShadingLanguage's compiler component library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "liboslcomp1_15-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "7b64bee389e50073d531969c476cbce38d0bc57ca984c5395198328af080df0ff76ea567f955b3985a00a5ef448a581cc0e2db59a2b3d0801933cb1efd7224d5"

RPROVIDES:${PN} += "liboslcomp.so.1.15 \
liboslcomp1-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libOpenImageIO-Util.so.3.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
