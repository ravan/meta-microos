SUMMARY = "A portable C FFI for Lua 5.1+"
DESCRIPTION = "This is a portable C FFI for Lua, based on `libffi` and aiming \
to be mostly compatible with LuaJIT FFI, but written from \
scratch. Compatibility is preserved where reasonable, but not \
where not easily implementable (e.g. the parser extensions for \
64-bit `cdata` and so on). Thanks to `libffi`, it works on many \
operating systems and CPU architectures. The `cffi-lua` codebase \
itself does not contain any non-portable code (with the exception \
of things such as Windows calling convention handling on x86, and \
some adjustments for big endian architectures). Some effort was \
also taken to ensure compatibility with custom Lua configurations \
(e.g. with changed numeric type representations), though this is \
not tested or guaranteed to work (patches welcome if broken). \
 \
Unlike LuaJIT's `ffi` module or other efforts such as `luaffifb`, \
it works with every common version of the reference Lua \
implementation (currently 5.1, 5.2, 5.3 and 5.4, 5.0 could be \
supported but wasn't considered worth it) as well as compatible \
non-reference ones (like LuaJIT). Functionality from newer Lua \
versions is also supported, when used with that version (e.g. \
with 5.3+ you will get seamless integer and bit-op support, with \
5.4 you will get metatype support for to-be-closed variables, and \
so on). \
 \
Since it's written from scratch, having 1:1 bug-for-bug C parser \
compatibility is a non-goal. The parser is meant to comply with \
C11, plus a number of extensions from GCC, MSVC and C++ (where it \
doesn't conflict with C). \
 \
The project was started because there isn't any FFI for standard \
Lua that's as user friendly as LuaJIT's and doesn't have \
portability issues."
LICENSE = "MIT"

PV = "0.2.3+git.1769216057.4c6197f"

RPM_NAME = "lua53-cffi-lua-0.2.3+git.1769216057.4c6197f-1.4.aarch64.rpm"
RPM_HASH = "89e132e6e81ca12109a29d01eb7555fc0d8611a697c1ff796d0b306f1c8f7dac42fb8aee9f44bd42a3faa82ea7f97f07356af460a632fbe2ee567f862815122b"

RPROVIDES:${PN} += "lua53-cffi-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
lua53 \
lua53-compat-5.3"

inherit rpm
