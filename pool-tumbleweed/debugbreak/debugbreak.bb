SUMMARY = "Breakpoint injector for C/C++ code"
DESCRIPTION = "debugbreak.h allows setting breakpoints in C/C++ code with a call to \
the debug_break() function. \
 \
* Include one header file and insert calls to debug_break() in the code where \
  you wish to trap into the debugger. \
* Works well on ARM, AArch64, i686, x86-64, POWER and has a fallback code path \
  for other architectures. \
* Works like the DebugBreak() fuction provided by Windows and QNX."
LICENSE = "BSD-2-Clause"

PV = "1.0~git.20210702"

RPM_NAME = "debugbreak-1.0~git.20210702-1.10.noarch.rpm"
RPM_HASH = "15742c5c954e9687a0ff7b66d44f1eb5ea771d07deda8a021e9b44ef8d85bb3207db5296153c40aa46210ecd449b5ccc2f2192e1dccac9ebfd89b09160a5b09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debugbreak"

RDEPENDS:${PN} += ""

inherit rpm
