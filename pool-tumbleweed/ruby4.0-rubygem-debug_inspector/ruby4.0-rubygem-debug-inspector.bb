SUMMARY = "A Ruby wrapper for the MRI 2.0 debug_inspector API"
DESCRIPTION = "Adds methods to DebugInspector to allow for inspection of backtrace frames. \
The debug_inspector C extension and API were designed and built by Koichi \
Sasada, this project is just a gemification of his work. \
This library makes use of the debug inspector API which was added to MRI \
2.0.0. \
Only works on MRI 2 and 3. Requiring it on unsupported Rubies will result in a \
no-op. \
Recommended for use only in debugging situations. Do not use this in \
production apps."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ruby4.0-rubygem-debug_inspector-1.2.0-1.12.aarch64.rpm"
RPM_HASH = "f810b4de8cfcdecf18914c2ff0ee3bf521b7a8329c8a865993f741c5667fdaab0255b4a83b390859feec4348f0db7322921406b472cfabed94df57617fd306ee"

RPROVIDES:${PN} += "ruby4.0-rubygem-debug-inspector \
rubygem-debug-inspector \
rubygem-ruby-4.0.0-debug-inspector \
rubygem-ruby-4.0.0-debug-inspector-1 \
rubygem-ruby-4.0.0-debug-inspector-1.2 \
rubygem-ruby-4.0.0-debug-inspector-1.2.0"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit"

inherit rpm
