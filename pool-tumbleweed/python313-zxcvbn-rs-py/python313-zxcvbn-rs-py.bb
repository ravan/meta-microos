SUMMARY = "Python bindings for zxcvbn-rs, the Rust implementation of zxcvbn"
DESCRIPTION = "Python bindings for zxcvbn-rs, the Rust implementation of zxcvbn \
Zxcvbn is a password strength estimator inspired by password crackers. \
Through pattern matching and conservative estimation, it recognizes and \
weighs 30k common passwords, common names and surnames according to US \
census data, popular English words from Wikipedia and US television and movies, \
and other common patterns like dates, repeats (aaa), sequences (abcd), keyboard \
patterns (qwertyuiop), and l33t speak."
LICENSE = "MIT"

PV = "0.3.0+0"

RPM_NAME = "python313-zxcvbn-rs-py-0.3.0+0-1.8.aarch64.rpm"
RPM_HASH = "f83d4fb0c162ac162ad933ea61fc469e7bf3df8c6b72ecd06865270b4ac482318c0d2722247359d3206bc9f2915db68bce54416901561d6e34ab72c6003f63bf"

RPROVIDES:${PN} += "python3-zxcvbn-rs-py \
python3.13dist-zxcvbn-rs-py \
python313-zxcvbn-rs-py \
python3dist-zxcvbn-rs-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
