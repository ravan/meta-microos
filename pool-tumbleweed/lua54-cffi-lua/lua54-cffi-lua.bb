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

RPM_NAME = "lua54-cffi-lua-0.2.3+git.1769216057.4c6197f-1.4.aarch64.rpm"
RPM_HASH = "91b1da4d573a54e13c0eca723eb053b5cdc5400de2f5aef62e5f15ef5ec9976ae7643d44ca4de73fce74d1820828e72b5376f58b8a35ff8dc78fe366dec8f874"

RPROVIDES:${PN} += "cffi-lua \
lua-cffi-lua \
lua54-cffi-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
lua54 \
lua54-compat-5.3"

inherit rpm
