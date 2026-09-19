SUMMARY = "Oracle Cluster File System 2 tools for the native o2cb stack"
DESCRIPTION = "OCFS is the Oracle Cluster File System. \
 \
This package contains the tools to manage the native o2cb stack for the \
OCFS2 filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.8.8"

RPM_NAME = "ocfs2-tools-o2cb-1.8.8-8.6.aarch64.rpm"
RPM_HASH = "aa18fd7bcc824c9f36755e2d15e191cebc1eacbb0778f459b412d2942ee340e6f1e66875ddea0715b90f89b5ce230f943e7e59e74945ffe3396d108607c4c59d"

RPROVIDES:${PN} += "ocfs2-tools-o2cb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcmap.so.4 \
libcom-err.so.2 \
libdlm-lt.so.3 \
libglib-2.0.so.0 \
ocfs2-tools"

inherit rpm
