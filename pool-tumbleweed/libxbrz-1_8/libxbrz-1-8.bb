SUMMARY = "Pattern recognition rule-based bitmap upscaler"
DESCRIPTION = "The idea of xBR is to scale bitmaps using pattern recognition (like \
HQx), but also uses a 2-stage set of interpolation rules, which \
better handle more complex patterns such as antialiased lines and \
curves. Background textures keep the sharp characteristics of the \
original image rather than becoming blurry like with HQx. \
 \
xBRZ follows this idea, but has a different set of rules, focusing on \
preserving small image features consisting of few pixels only, like \
commonly used in faces."
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "libxbrz-1_8-1.8-2.13.aarch64.rpm"
RPM_HASH = "53a811c6b68efb940169eddf40fe0182cc63e8657bb7f5cecc0a89f33693f5b62574f2549a08c05764054297a0e12478999804b2961f997d5b9d55f9dab1aa51"

RPROVIDES:${PN} += "libxbrz-1-8 \
libxbrz-1.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
