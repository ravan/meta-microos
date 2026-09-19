SUMMARY = "A semantic search tool for C and C++ codebases"
DESCRIPTION = "weggli is a semantic search tool for C and C++ codebases. It helps \
security researchers identify interesting functionality in \
large codebases. \
 \
weggli performs pattern matching on Abstract Syntax Trees based on user \
provided queries. Its query language resembles C and C++ code, making it possible \
to turn interesting code patterns into queries. \
 \
weggli has support for C++ constructs such as \
lambda expressions, range-based for loops and constexprs. \
weggli does not require the ability to build the software and can \
work with incomplete sources or missing dependencies."
LICENSE = "Apache-2.0"

PV = "0.2.4"

RPM_NAME = "weggli-0.2.4-2.17.aarch64.rpm"
RPM_HASH = "06280bdf109bdff6ba0900fc092ea4054c67e481805c82d46b5e94ebba9b760946e287cc23394d1c5d4408eab4faa0f905320f930b4672aa7b4ee9f76d1ba823"

RPROVIDES:${PN} += "weggli"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
