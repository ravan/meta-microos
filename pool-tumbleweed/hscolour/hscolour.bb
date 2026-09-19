SUMMARY = "Colourise Haskell code"
DESCRIPTION = "Hscolour is a small Haskell script to colourise Haskell code. It currently has \
six output formats: ANSI terminal codes (optionally XTerm-256colour codes), \
HTML 3.2 with <font> tags, HTML 4.01 with CSS, HTML 4.01 with CSS and mouseover \
annotations, XHTML 1.0 with inline CSS styling, LaTeX, and mIRC chat codes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25"

RPM_NAME = "hscolour-1.25-1.32.aarch64.rpm"
RPM_HASH = "bc1fbe2c4c95ed9d83408741ed894d429abb4a11a9634e5faee6344500063e2078e68ee8316e16a038207cf0713599e6db3f941867494d652d9336f26ff80581"

RPROVIDES:${PN} += "hscolour"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
