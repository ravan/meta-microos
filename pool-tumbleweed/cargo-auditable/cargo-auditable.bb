SUMMARY = "A tool to embed auditing information in ELF sections of rust binaries"
DESCRIPTION = "Know the exact crate versions used to build your Rust executable. Audit binaries for known bugs or \
security vulnerabilities in production, at scale, with zero bookkeeping. This works by embedding \
data about the dependency tree in JSON format into a dedicated linker section of the compiled \
executable."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & MIT"

PV = "0.7.5~0"

RPM_NAME = "cargo-auditable-0.7.5~0-1.4.aarch64.rpm"
RPM_HASH = "91691f4f420d1ce6826ba16234e7854c7d295a9b968bcb266f6692de37f84dd0b1e918135e821008a0216700e0994d427abbf8c2569257a9324971038ffc4d53"

RPROVIDES:${PN} += "cargo-auditable"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
rust+cargo"

inherit rpm
