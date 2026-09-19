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

RPM_NAME = "python314-zxcvbn-rs-py-0.3.0+0-1.8.aarch64.rpm"
RPM_HASH = "bf1b0b67cea2d86f8ca93acc9cf3bffab1adbf10d454c106d5eef7e1221e84feaf44bab50828f193ef6b3a1bb187e9bc2fca08d03afb0a4fa8a50573bed15f45"

RPROVIDES:${PN} += "python3.14dist-zxcvbn-rs-py \
python314-zxcvbn-rs-py \
python3dist-zxcvbn-rs-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
