SUMMARY = "Binary files of m-tx"
DESCRIPTION = "Binary files of m-tx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78123"

RPM_NAME = "texlive-m-tx-bin-2026.20260301.svn78123-120.4.aarch64.rpm"
RPM_HASH = "9e7e3e36e923b214534bc36f28c640e81bc12551775db75d05437f42e70b0c344b9abbb502a7457d25b97fe1c29c7bcfc53e826d3b89247b39e797ed7ab15c96"

RPROVIDES:${PN} += "texlive-m-tx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-m-tx"

inherit rpm
