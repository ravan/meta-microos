SUMMARY = "C/C++/ObjC language server"
DESCRIPTION = "ccls, which originates from cquery, is a C/C++/Objective-C language server. \
 \
- code completion (with both signature help and snippets) \
- definition/references, and other cross references \
- cross reference extensions: $ccls/call $ccls/inheritance $ccls/member \
  $ccls/vars ... \
- formatting \
- hierarchies: call (caller/callee) hierarchy, inheritance (base/derived) \
  hierarchy, member hierarchy \
- symbol rename \
- document symbols and approximate search of workspace symbol \
- hover information \
- diagnostics and code actions (clang FixIts) \
- semantic highlighting and preprocessor skipped regions \
- semantic navigation: $ccls/navigate"
LICENSE = "Apache-2.0 & CC0-1.0 & BSL-1.0"

PV = "0.20250815.1"

RPM_NAME = "ccls-0.20250815.1-3.1.aarch64.rpm"
RPM_HASH = "8cd59527422c80f1c3f58cbd47598545d8358ca738a63e7058cbb03d674228a751c108fcb551e891ad2dd006452f86dcc2169749f93d233f01bbf8525aea2428"

RPROVIDES:${PN} += "bundled-macro-map \
bundled-siphash \
ccls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
