SUMMARY = "Simple interface for implementing erasure codes"
DESCRIPTION = "This library makes use of Jesasure for Reed-Solomon as implemented by the \
liberasurecode library and provides its' own flat XOR-based erasure code \
encoder and decoder.  Currently, it implements a specific class of HD \
Combination Codes (see 'Flat XOR-based erasure codes in storage systems: \
Constructions, efficient recovery, and tradeoffs' in IEEE MSST 2010).  These \
codes are well-suited to archival use-cases, have a simple construction and \
require a minimum number of participating disks during single-disk \
reconstruction (think XOR-based LRC code)."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python314-PyECLib-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "9657758f3d15d52b880f36a3061128fd27c985f3e27fbaac6d884e793640606b7d6f2de32d2038310f8d1033e5a79a3260a55500bf9cf2893c2e504090ca849b"

RPROVIDES:${PN} += "python3.14dist-pyeclib \
python314-PyECLib \
python3dist-pyeclib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
liberasurecode.so.1 \
python-abi"

inherit rpm
