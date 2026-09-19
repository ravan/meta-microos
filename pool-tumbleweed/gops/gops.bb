SUMMARY = "A tool to list and diagnose Go processes currently running on your system"
DESCRIPTION = "gops is a command to list and diagnose Go processes currently running on your \
system. For processes that starts the diagnostics agent, gops can report \
additional information such as the current stack trace, Go version, memory stats, \
etc. It is possible to use gops tool both in local and remote mode."
LICENSE = "BSD-3-Clause-Clear"

PV = "0.3.28"

RPM_NAME = "gops-0.3.28-1.13.aarch64.rpm"
RPM_HASH = "766ad1511552d24537031722712d60aef267b99adcf02660308c78b942d02a9ccb02a3e76230655964ddb85d9150f6ce8b963aba70ae66307582fa0de2e44d78"

RPROVIDES:${PN} += "gops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
