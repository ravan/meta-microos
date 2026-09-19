SUMMARY = "Programming language for digital color management"
DESCRIPTION = "The Color Transformation Language (CTL) is a programming language for digital \
color management systems (CMS). Color transforms are to be expressed as \
programs (rather than declarations), and a CTL interpreter is used to execute \
such programs and perform transformations. \
 \
Color transforms can be shared by distributing CTL programs. Two \
parties with the same CTL program can apply the same transform to an \
image."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "ctl-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "2f6bf03eb46bc04dd29e9dc64609a1bbb9e915227a6a84e894d21a276b53509e5f57f3f781e7132b041780e467c626d614debf2c9633672bfeb4a07a8435b8ba"

RPROVIDES:${PN} += "ctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libIlmCtl.so.1.5 \
libIlmCtlSimd.so.1.5 \
libIlmImfCtl.so.1.5 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
