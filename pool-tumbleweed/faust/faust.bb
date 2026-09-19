SUMMARY = "Functional Programming Language for Real Time Signal Processing"
DESCRIPTION = "Faust (Functional Audio Stream) is a functional programming language \
specifically designed for real-time signal processing and synthesis. \
A distinctive characteristic of Faust is to be fully compiled. \
 \
The Faust compiler translates DSP specifications into very efficient code for \
various languages (C++, C, JAVA, JavaScript, ASM JavaScript, LLVM IR, \
WebAssembly etc.) working at sample level. It targets high-performance signal \
processing applications, libraries and audio plug-ins for a variety of audio \
platforms and standards. A same Faust specification can be used to easily \
generate various kinds of native standalone applications, iOS and Android apps, \
as well as Csound, LADSPA, Max/MSP, PD, Q, SuperCollider, VST, AU plugins, etc. \
(see the README in the /architecture folder for an exhaustive list)."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "faust-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "582e5589c04d8fcf78606711a7dc0dcd2ac119636776e4addcec0483a039cb78bbeee6f33adcc591d4e51dbe5e0719e6c820afe8aed96ec215584ab5212b75d8"

RPROVIDES:${PN} += "faust"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/ruby \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
which"

inherit rpm
