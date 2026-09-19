SUMMARY = "Python bindings for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides python bindings for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5.0.3+git20241211.69167fb"

RPM_NAME = "python3-pocketsphinx-5.0.3+git20241211.69167fb-1.6.aarch64.rpm"
RPM_HASH = "e7c44ffc467bb1cef45dd5035915c6ea7f54be2aa563bd619d569674018d090383ddc41dd1ab9b3749fecbb126a0834eeac9ed49b6e16d46b9f590d984481ea1"

RPROVIDES:${PN} += "python3-pocketsphinx \
python3-pocketsphinx5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpocketsphinx.so.5 \
pocketsphinx \
python-abi"

inherit rpm
