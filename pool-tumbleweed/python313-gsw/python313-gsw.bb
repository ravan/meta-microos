SUMMARY = "Gibbs Seawater Oceanographic Package of TEOS-10"
DESCRIPTION = "Python implementation of the Thermodynamic Equation of \
Seawater 2010 (TEOS-10)."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.6.23"

RPM_NAME = "python313-gsw-3.6.23-1.2.aarch64.rpm"
RPM_HASH = "1f0091c5b9922f13abd4467dac9779a224f1d9dde881626ad33af3384d54f1d0757bd318c5fba925a9a2671c781ab59fcf1421771ef116d47788839fa6922439"

RPROVIDES:${PN} += "python3-gsw \
python3.13dist-gsw \
python313-gsw \
python3dist-gsw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy"

inherit rpm
