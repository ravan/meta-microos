SUMMARY = "CommonMark parsing and rendering library"
DESCRIPTION = "cmark-gfm is GitHub's fork of cmark, the C reference implementation of \
CommonMark with GitHub Flavored Markdown extensions. \
 \
This package provides the shared library for parsing and rendering \
CommonMark documents."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.29.0.gfm.13"

RPM_NAME = "libcmark-gfm0_29_0_gfm_13-0.29.0.gfm.13-1.3.aarch64.rpm"
RPM_HASH = "9e491a5665625452429c17b8b778204e6915badab0796fae493a2ae0d277e7517adde614077f7c53f68a10609d1976d487277a84f0da2417c4fd9a194c12701f"

RPROVIDES:${PN} += "libcmark-gfm.so.0.29.0.gfm.13 \
libcmark-gfm0-29-0-gfm-13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
