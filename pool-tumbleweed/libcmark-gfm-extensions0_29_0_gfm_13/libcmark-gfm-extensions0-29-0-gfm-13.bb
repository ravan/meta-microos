SUMMARY = "GitHub Flavored Markdown extensions for cmark-gfm"
DESCRIPTION = "cmark-gfm is GitHub's fork of cmark, the C reference implementation of \
CommonMark with GitHub Flavored Markdown extensions. \
 \
This package provides the shared library implementing the GitHub \
Flavored Markdown extensions (tables, strikethrough, autolinks, task \
lists and more)."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.29.0.gfm.13"

RPM_NAME = "libcmark-gfm-extensions0_29_0_gfm_13-0.29.0.gfm.13-1.3.aarch64.rpm"
RPM_HASH = "5f19ae8848713e5e049c45ff16e3df8953452f54b7c14e0362b3af9cf93d7605436b5f43b637e35349893dda449ec0b7c5ce129d564651586e068e84016904ba"

RPROVIDES:${PN} += "libcmark-gfm-extensions.so.0.29.0.gfm.13 \
libcmark-gfm-extensions0-29-0-gfm-13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmark-gfm.so.0.29.0.gfm.13"

inherit rpm
