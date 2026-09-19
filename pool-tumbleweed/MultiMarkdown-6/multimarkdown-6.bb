SUMMARY = "Reference implementation of MultiMarkdown"
DESCRIPTION = "MultiMarkdown is a derivative of Markdown that adds new syntax features, \
such as footnotes, tables, and metadata. Additionally, it offers mechanisms \
to convert plain text into LaTeX in addition to HTML."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "MultiMarkdown-6-6.8.0-1.1.aarch64.rpm"
RPM_HASH = "4cb41671a8fd30649a4e5531f42f7954842ee93c20bfb7c74aab791fc6c462a60ac31f866d5b3ae59586ce193e8bedbc221f295332085cd70702a582ca3bc22f"

RPROVIDES:${PN} += "MultiMarkdown-6 \
markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-filesystem \
update-alternatives"

inherit rpm
