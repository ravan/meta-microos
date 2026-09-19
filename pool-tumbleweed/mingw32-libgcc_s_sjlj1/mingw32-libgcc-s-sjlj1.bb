SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries \
 \
This libgcc build uses SJLJ, a method for exception handling based on \
setjmp/longjmp. SJLJ-based EH is much slower than DWARF-2 EH, \
penalizing even normal execution when no exceptions are thrown, but \
can work across code that has not been compiled with GCC or that does \
not have call-stack unwinding information. \
 \
[The DWARF-2 EH implementation for Windows is not at all designed to \
work under 64-bit Windows applications. In Win32 mode, the exception \
unwind handler cannot propagate through non-DW2 aware code, which \
means that any exception going through any non-DW2-aware 'foreign \
frame' code will fail, including Windows system DLLs and DLLs built \
with Visual Studio. DWARF-2 unwinding code in GCC inspects the x86 \
unwinding assembly and is unable to proceed without other DWARF-2 \
unwind information.]"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libgcc_s_sjlj1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "9b5b80eb136cb01c31afb5b2f1ecc63d86301adab6e84688f37a59a987fc40c906b6b806aa476f52d5474fa1218601bca528c7e6af5914c52b0e9a11a06112d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgcc \
mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgcc-s-sjlj1"

RDEPENDS:${PN} += "mingw32-libwinpthread-1.dll"

inherit rpm
