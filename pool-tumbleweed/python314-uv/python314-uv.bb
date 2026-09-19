SUMMARY = "A Python package installer and resolver, written in Rust"
DESCRIPTION = "uv is a Python package installer and resolver, written in Rust. Designed as a \
drop-in replacement for common pip and pip-tools workflows."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "0.12.13"

RPM_NAME = "python314-uv-0.12.13-1.1.aarch64.rpm"
RPM_HASH = "d7f336949da2a96904a44a8874cd32780e7abeb4fce8f96661e94a3b651affe50c78663421d90912d323c4e73f1dca503200c42d8ec755a829f6e13115b2dc4d"

RPROVIDES:${PN} += "python3.14dist-uv \
python314-uv \
python3dist-uv \
uv"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python3"

inherit rpm
