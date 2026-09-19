SUMMARY = "Simple markdown translator"
DESCRIPTION = "lowdown is a Markdown translator producing HTML5, roff documents in the ms and \
man formats, LaTeX, gemini, OpenDocument, and terminal output. \
The open source C source code has no dependencies. The tools are documented in \
lowdown(1) and lowdown-diff(1), the language in lowdown(5), \
and the library interface in lowdown(3). \
 \
lowdown is a fork of hoedown, although the parser and front-ends have changed \
significantly."
LICENSE = "ISC"

PV = "3.1.1"

RPM_NAME = "lowdown-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "7a5a9e361f0b34756e7f81827b06534fa52037540d349d4087bbc6b505453aaec829b75c92df14d264778cef0c6d5639146fcda8e0eeac030a32405fc67f64a2"

RPROVIDES:${PN} += "lowdown"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
