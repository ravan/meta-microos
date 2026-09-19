SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "3.4.1"

RPM_NAME = "python313-hiredis-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "bb5b280e2bf3a2ed165c35754ef8fb361e3eba7a1ad0af48dbd095b10316f9fa358881c25ed90a6483846eb65edaf85ad5758c404597c248add0fcdd941f9190"

RPROVIDES:${PN} += "python3-hiredis \
python3.13dist-hiredis \
python313-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.3.0 \
python-abi"

inherit rpm
