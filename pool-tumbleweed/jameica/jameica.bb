SUMMARY = "Runtime environment for Java applications like Hibiscus"
DESCRIPTION = "Serves as a base framework for recurring tasks on Hibiscus. \
Keeps a unified look & feel. Strictly separate program and \
user data. Supports synchronous and asynchronous data exchange \
via between plugins (via messaging) and allows client server \
communication via RMI, XML-RPC and SOAP. Comes with headless \
mode (no GUI for servers) and logging."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.12.0"

RPM_NAME = "jameica-2.12.0-1.5.aarch64.rpm"
RPM_HASH = "5720e91d14925253eef081b5bd9bc5454318ae86cb09f6b61e4e059dfd953c6ab0c77863bd271ab3f80fdcf0a20fb30f519d7fc8763a07fe2aff0bc90db18456"

RPROVIDES:${PN} += "jameica"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
libgthread-2-0-0"

inherit rpm
