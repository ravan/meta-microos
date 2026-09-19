SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "The eSpeak NG (Next Generation) Text-to-Speech program is a speech \
synthesizer that supports 100 languages and accents. It is based \
on the eSpeak engine created by Jonathan Duddington. It uses \
spectral formant synthesis by default which sounds robotic, but can \
be configured to use Klatt formant synthesis or MBROLA to give it a \
more natural sound."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "espeak-ng-1.52.0-2.6.aarch64.rpm"
RPM_HASH = "2ff729eceea498dd2de11dfc13578a11ac7d2a5824a7e3e6f7e99ede0e5dd8d5737091be32d6d019c81e09ea7f0deb91393296c4cbb51fea89be75fac0c15a3f"

RPROVIDES:${PN} += "espeak-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak-ng.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpcaudio.so.0 \
libstdc++.so.6"

inherit rpm
