SUMMARY = "Compiler for the Zig language"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software. \
 \
* Robust - behavior is correct even for edge cases such as out of memory. \
* Optimal - write programs the best way they can behave and perform. \
* Reusable - the same code works in many environments which have different constraints. \
* Maintainable - precisely communicate intent to the compiler and other programmers. \
The language imposes a low overhead to reading code and is resilient to changing requirements and environments."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "zig-0.15.2-1.2.aarch64.rpm"
RPM_HASH = "b65c09159cf9313ad261ef3c8250cffecc4cba25a7029db07f32eab2c1550d95bb9c6dfda72ca74009fca5ddaeb40186455f04da20e839d30f1387feba306984"

RPROVIDES:${PN} += "zig"

RDEPENDS:${PN} += "zig-implementation"

inherit rpm
