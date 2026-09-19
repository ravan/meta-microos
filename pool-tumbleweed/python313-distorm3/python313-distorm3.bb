SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python313-distorm3-3.5.2-2.7.aarch64.rpm"
RPM_HASH = "4802439eea99c571c894fd8151d6a9a6922f0930af8bb6e7002a72b6572da873d6ed4da33777e2e00a619b23cfedeeba58fbad05a324074d785d972e3144dac8"

RPROVIDES:${PN} += "python3-distorm3 \
python3.13dist-distorm3 \
python313-distorm3 \
python3dist-distorm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
