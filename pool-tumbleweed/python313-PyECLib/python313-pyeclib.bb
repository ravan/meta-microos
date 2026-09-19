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

RPM_NAME = "python313-PyECLib-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "e522191f5768fee808283f95a501f194ee4eb8d65544f64404f02b5b80088c39c45e6c7ec2788a318aa5ab9bf10d38298243320ebd752d6fdaaf3ce8b0204f9f"

RPROVIDES:${PN} += "python3-PyECLib \
python3.13dist-pyeclib \
python313-PyECLib \
python3dist-pyeclib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
liberasurecode.so.1 \
python-abi"

inherit rpm
